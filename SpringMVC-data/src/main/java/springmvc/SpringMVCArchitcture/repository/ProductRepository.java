package springmvc.SpringMVCArchitcture.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.SpringMVCArchitcture.Model.ProductModel;

@Repository
public class ProductRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void sAddProd(ProductModel pm) {
		
		hibernateTemplate.saveOrUpdate(pm);
		System.out.println("Product inserted by repository");
			}
	
	public List<ProductModel> find(ProductModel pm){
		
		if (pm != null) {
			List<ProductModel> list = (List<ProductModel>) hibernateTemplate.find("from ProductModel");
			return list;
		} else {
			return null;
		}
		
	}
}
