package springmvc.SpringMVCArchitcture.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import springmvc.SpringMVCArchitcture.Model.LoginModel;



//import springmvc.SpringMVCArchitcture.model.LoginModel;

@Repository
public class LoginRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<LoginModel> usersignIn(String emailId,String password)
	{	
		
		System.out.println("I am in Repository");
		
		/*System.out.println(lm.getEmailId());
		System.out.println(lm.getPassword());*/
		
		if (emailId != null && password != null) {
			List<LoginModel> list =   (List<LoginModel>) hibernateTemplate.find("from LoginModel al where al.emailId = ? and al.password = ?", emailId, password);
			return  list;
		} else {
			return null;
		}
		
	
		
	}

	

}
