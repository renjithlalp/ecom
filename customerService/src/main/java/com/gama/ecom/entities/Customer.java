package com.gama.ecom.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="customer")
@Table(name="customer",schema="mysoftcorner")
public class Customer implements Serializable{
	
	
	private static final long serialVersionUID = 9112352909417102595L;

	@Id
	private String customer_id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private float lastName	;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address_id")
	private String addressId;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="last_update")
	private Date lastUpdate;

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public float getLastName() {
		return lastName;
	}

	public void setLastName(float lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	

}
