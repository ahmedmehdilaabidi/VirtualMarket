package com.esprit.market.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.esprit.market.domain.Product;
import com.esprit.market.service.ProductDao;
import com.esprit.market.utils.JPAUTIL;

public class ProductDaoImpl implements ProductDao {

	EntityManager entityManager = JPAUTIL
			.getEntityManager("com.esprit.miniprojet.virtualMarket");

	public void addProduct(Product p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);
		tx.commit();

	}

	public void deleteProduct(Product p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Product prod = entityManager.find(Product.class, p.getIdProduct());
		entityManager.remove(prod);
		tx.commit();

	}

	public void updateproduct(Product p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		Product prod = entityManager.find(Product.class, p.getIdProduct());

		prod.setIdProduct(p.getIdProduct());
		prod.setNameProduct(p.getNameProduct());
		prod.setPriceProduct(p.getPriceProduct());
		prod.setDescriptionProduct(p.getDescriptionProduct());
		entityManager.merge(prod);
		tx.commit();

	}

	public Product getProductById(int id) {
		return entityManager.find(Product.class,id);
	}

	public List<Product> listProduct() {
		String jpql = "select prod from Product prod ";
		Query query = entityManager.createQuery(jpql);
//		Query q = em.createNamedQuery("Files.findAll");
//	    List rl = q.getResultList();
		return query.getResultList();
	}

}
