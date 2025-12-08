package com.ecom.model;

import org.springframework.data.annotation.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private UserDtls user;
	
	@ManyToOne
	private Product product;
	
	private int quantity;
	
	@Transient
	private double totalPrice;
	
	@Transient
	private double totalOrderPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserDtls getUser() {
		return user;
	}

	public void setUser(UserDtls user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public void setTotalOrderPrice(double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}
	
	
	
	

}
