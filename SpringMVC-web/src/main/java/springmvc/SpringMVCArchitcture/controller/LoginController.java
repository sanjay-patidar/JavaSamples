package springmvc.SpringMVCArchitcture.controller;

import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.SpringMVCArchitcture.Model.LoginModel;
import springmvc.SpringMVCArchitcture.service.LoginService;



@Controller
public class LoginController {
	
@Autowired	
private LoginService loginservice;
	
	@RequestMapping("/login")
			public String showLogin(Map<String, Object> map) {
				
				//loginservice.usersignIn();
			
				LoginModel lm=new LoginModel();
				
				map.put("list", lm);
				return "login";
			}
	@RequestMapping(value="/LoginSubmit.do", method=RequestMethod.POST)
			public String submitLogin(@ModelAttribute("list") LoginModel lm)
			{
				lm=(LoginModel) loginservice.usersignIn(lm);
				if (lm == null) {
					
					return "login";
				} else {
					
					
					return "welcome";
				}
				/*System.out.println(lm.getEmailId());
				System.out.println(lm.getPassword());
				return "login";*/
			}
				
}
