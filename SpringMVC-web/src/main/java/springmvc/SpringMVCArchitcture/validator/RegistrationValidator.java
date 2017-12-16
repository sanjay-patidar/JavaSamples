package springmvc.SpringMVCArchitcture.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import springmvc.SpringMVCArchitcture.Model.RegistrationModel;

@Component
public class RegistrationValidator implements Validator {

	public boolean supports(Class<?> clazz) {

		return RegistrationModel.class.isAssignableFrom(clazz);
	}

	public void validate(Object object, Errors errors) {
		System.out.println("hi welcome to registrationvalidator");

		RegistrationModel regmod = (RegistrationModel) object;
		ValidationUtils.rejectIfEmpty(errors, "firstname", "error.fn", "please enter firstname");
		ValidationUtils.rejectIfEmpty(errors, "lastname", "error.ln", "please enter lastname");
		ValidationUtils.rejectIfEmpty(errors, "email", "error.mail", "please enter emailid");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.pwd", "please enter password");
		ValidationUtils.rejectIfEmpty(errors, "mobilenumber", "error.mob", "please enter mobilenumber");
		ValidationUtils.rejectIfEmpty(errors, "address", "error.ads", "please enter address");

		if (regmod.getMobilenumber() == 0) {
			errors.rejectValue("mobilenumber", "error.mob", "please enter mobilenumber");
		}

		if (regmod.getFirstname().trim().length() < 4) {
			errors.rejectValue("firstname", "error.fn", "please enter atleast 4 character");
		}

		if (regmod.getLastname().trim().length() < 4) {
			errors.rejectValue("lastname", "error.ln", "please enter atleast 4 character");
		}

		if (regmod.getEmail() != null && regmod.getEmail().trim().length() > 0) {

			if (regmod.getEmail().contains("@") != true) {
				errors.rejectValue("email", "error.mail", "error.please enter @");
			} else if (regmod.getEmail().contains(".com") != true && regmod.getEmail().contains(".net") != true) {
				errors.rejectValue("email", "error.mail", "error.please use .com or .net");
			}
		}

		if (regmod.getPassword().trim().length() < 8 && regmod.getPassword().trim().length() > 16
				&& regmod.getPassword().contains("-") != true) {
			errors.rejectValue("password", "error.pwd", "password must have 8-16 characters and must contain -");
		}
				/*Srirang*/
		/*
		 * if(regmod.getMobilenumber()!=0) { Pattern pattern = Pattern.compile(
		 * "[0-9]{10}"); Matcher matcher =
		 * pattern.matcher(regmod.getMobilenumber()); if (((Matcher)
		 * matcher).matches() != true) { errors.rejectValue("mobilenumber",
		 * "error.mob", "Enter a correct phone number"); } }
		 */

	}

}
