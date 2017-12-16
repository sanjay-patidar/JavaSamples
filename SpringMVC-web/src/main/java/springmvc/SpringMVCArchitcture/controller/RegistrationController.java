package springmvc.SpringMVCArchitcture.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import springmvc.SpringMVCArchitcture.Model.RegistrationModel;

import springmvc.SpringMVCArchitcture.service.RegistrationService;
import springmvc.SpringMVCArchitcture.validator.RegistrationValidator;

@Controller
public class RegistrationController {
	
	@Autowired	
	private RegistrationService registrationservice;
	
	@Autowired
	private RegistrationValidator registrationvalidator;
	
	
	@RequestMapping("/registration")
	public String showRegistration(Map<String,Object> map)
	{
		RegistrationModel rm=new RegistrationModel();
		map.put("list", rm);
		System.out.println(rm.getFirstname());
		System.out.println(rm.getLastname());
		System.out.println(rm.getEmail());
		System.out.println(rm.getPassword());
		System.out.println(rm.getMobilenumber());
		System.out.println(rm.getAddress());
		
		return "registration";
	}
	
	@RequestMapping(value="/registrationsubmit.do", method=RequestMethod.POST)
	public String submitRegistration(@ModelAttribute("list") RegistrationModel rm,BindingResult result)
	{
		registrationvalidator.validate(rm, result);
		if(result.hasErrors())
		{
			return "registration";
		}
		else {
			if(!registrationservice.saveRegistration(rm))
			{
				return "registration";
			}
			else {
				return "welcome";
			}
		
		}
		
		
		
		
		
	}
}
