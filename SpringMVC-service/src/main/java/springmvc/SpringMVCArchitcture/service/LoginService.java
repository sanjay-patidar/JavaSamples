package springmvc.SpringMVCArchitcture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import springmvc.SpringMVCArchitcture.Model.LoginModel;
import springmvc.SpringMVCArchitcture.repository.LoginRepository;




@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginrepository;
	  
	public LoginModel usersignIn(LoginModel login)
	{
		//loginrepository.usersignIn(lm);
		
		System.out.println("I am in service");
		
		/*System.out.println(lm.getEmailId());
		System.out.println(lm.getPassword());*/
		
		List<LoginModel> list=loginrepository.usersignIn(login.getEmailId(),login.getPassword());
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}
	
}
