package com.spring.app.service;

import java.util.List;

import com.spring.app.entity.Product;

public interface AppService {
	List<Product> getProdcuts();

	void addProduct(Product product);

	Product getProduct(int id);

	void deleteProduct(int id);
}
