package com.gama.ecom.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="product")
@Table(name="product",schema="mysoftcorner")
public class Product implements Serializable{
	
	private static final long serialVersionUID = -9155443822648044181L;

	@Id
	private String productId;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="price_perunit")
	private float pricePerUnit;
	
	@Column(name="basic_unit")
	private String basicUnit;
	
	@Column(name="tax_percentage")
	private float tax;
	
	@Column(name="active_for_sale")
	private boolean active;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(float pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getBasicUnit() {
		return basicUnit;
	}

	public void setBasicUnit(String basicUnit) {
		this.basicUnit = basicUnit;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
