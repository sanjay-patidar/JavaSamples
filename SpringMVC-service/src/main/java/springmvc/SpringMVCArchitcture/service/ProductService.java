package springmvc.SpringMVCArchitcture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.SpringMVCArchitcture.Model.ProductModel;
import springmvc.SpringMVCArchitcture.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prodRepo;
	
	public List<ProductModel> saveProduct(ProductModel prodModel){
		System.out.println("inside Services");
		prodRepo.sAddProd(prodModel);
		
		
		System.out.println("product save");
		List l = prodRepo.find(prodModel);
		if(l != null) {
			System.out.println(l);
			return l;
		}
		
		
		return null;
		
	}
}
