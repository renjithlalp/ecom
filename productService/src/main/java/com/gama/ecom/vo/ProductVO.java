package com.gama.ecom.vo;

import java.io.Serializable;

public class ProductVO  implements Serializable{
	
	private static final long serialVersionUID = -7447174044375168376L;


	private String productId;
	
	
	private String productName;
	
	
	private float pricePerUnit;
	
	
	private String basicUnit;
	
	
	private float tax;
	
	
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
