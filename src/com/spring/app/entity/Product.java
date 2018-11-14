package com.spring.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="products")
@Table(name="products")
public class Product {
	@Id
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="cost")
	private int cost;
	
	public Product() {
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", cost=" + cost + "]";
	}
	
	
}
