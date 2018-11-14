package com.spring.app.dao;

import java.util.List;

import com.spring.app.entity.Product;

public interface ProductDao {
	List<Product> productList();

	void addProduct(Product product);

	Product getProduct(int id);

	void deleteProduct(int id);
}
