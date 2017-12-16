package springmvc.SpringMVCArchitcture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.SpringMVCArchitcture.Model.RegistrationModel;

import springmvc.SpringMVCArchitcture.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationrepository;
	
	public boolean saveRegistration(RegistrationModel registration)
	{
		registrationrepository.saveRegistration(registration);
		if(registration !=null)
		{
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
