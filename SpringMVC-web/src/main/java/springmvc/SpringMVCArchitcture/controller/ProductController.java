package springmvc.SpringMVCArchitcture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.SpringMVCArchitcture.Model.ProductModel;
import springmvc.SpringMVCArchitcture.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@RequestMapping(value = "/product", method = {RequestMethod.GET, RequestMethod.POST })
	public String addProduct(@ModelAttribute("list") ProductModel pm, ModelMap m){
		
		if(RequestMethod.GET.equals("GET")) {
			// logic for GET
			m.put("list", pm );
			return "product" ;
		}else {
			// Logic for POST
			System.out.println("i am controller");
			System.out.println(pm.getProdId());
			
			List l = ps.saveProduct(pm);
			m.addAttribute("lostOfProd", l);
			return "product";
			
		}
		
		
	}

}
