package com.spring.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.dao.ProductDao;
import com.spring.app.entity.Product;
@Service
public class AppServiceImpl implements AppService {
	@Autowired
	private ProductDao productDao;
	@Override
	@Transactional
	public List<Product> getProdcuts() {
		
		return productDao.productList();
	}
	@Transactional
	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
		
	}
	@Transactional
	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productDao.getProduct(id);
	}
	@Transactional
	@Override
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}

}
