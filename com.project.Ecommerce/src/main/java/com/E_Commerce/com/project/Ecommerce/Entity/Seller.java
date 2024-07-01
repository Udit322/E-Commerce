package com.E_Commerce.com.project.Ecommerce.Entity;

import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Seller {


private Integer sellerId;
private String firstName;
private String lastName;
private String mobileNo;
private String emailId;
private String password;

@OneToMany(mappedBy = "seller")
private List<Poduct> products;

private Integer cartItemId;

@ManyToOne
@JoinColumn(name = "product_id")
private Poduct product;

private Integer cartItemQuantity;

public Integer getSellerId() {
	return sellerId;
}

public void setSellerId(Integer sellerId) {
	this.sellerId = sellerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public List<Poduct> getProducts() {
	return products;
}

public void setProducts(List<Poduct> products) {
	this.products = products;
}

public Integer getCartItemId() {
	return cartItemId;
}

public void setCartItemId(Integer cartItemId) {
	this.cartItemId = cartItemId;
}

public Poduct getProduct() {
	return product;
}

public void setProduct(Poduct product) {
	this.product = product;
}

public Integer getCartItemQuantity() {
	return cartItemQuantity;
}

public void setCartItemQuantity(Integer cartItemQuantity) {
	this.cartItemQuantity = cartItemQuantity;
}

public Seller() {
	super();
	// TODO Auto-generated constructor stub
}



}
