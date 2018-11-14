package com.spring.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.app.entity.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Product> productList() {
		Session session = sessionFactory.getCurrentSession();
		Query<Product> query = (Query<Product>) session.createQuery("from products");
		List<Product> productList = query.getResultList();
		return productList;
	}
	@Override
	public void addProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product); 
		
	}
	@Override
	public Product getProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		return product;
	}
	@Override
	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = (Query) session.createQuery("delete from products where productId=:productId");
		query.setParameter("productId", id);
		query.executeUpdate();
	}

}
