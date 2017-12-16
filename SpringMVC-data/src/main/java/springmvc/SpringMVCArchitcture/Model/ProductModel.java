package springmvc.SpringMVCArchitcture.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductModel")
public class ProductModel {
	@Id
	@Column(name = "prodId")
	private int prodId;
	
	@Column(name = "prodName")
	private String prodName;
	
	@Column(name = "prodCode")
	private String prodCode;
	
	@Column(name = "prodPrice")
	private double prodPrice;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

}
