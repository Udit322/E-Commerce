package com.E_Commerce.com.project.Ecommerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cart-items-details")
public class Cartitem {
	private Integer cartItemId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Poduct product;

    private Integer cartItemQuantity;

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

	public Cartitem() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
