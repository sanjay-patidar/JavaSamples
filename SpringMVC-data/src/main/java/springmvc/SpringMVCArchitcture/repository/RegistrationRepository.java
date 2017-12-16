package springmvc.SpringMVCArchitcture.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import springmvc.SpringMVCArchitcture.Model.RegistrationModel;

@Repository
public class RegistrationRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public RegistrationModel saveRegistration(@ModelAttribute("list") RegistrationModel registration) {
		if (registration != null) {
			hibernateTemplate.saveOrUpdate(registration);
		
			return registration;
		} else {
			return null;
		}
	}
}
