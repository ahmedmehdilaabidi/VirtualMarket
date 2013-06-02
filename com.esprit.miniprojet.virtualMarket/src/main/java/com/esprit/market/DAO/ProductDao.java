package com.esprit.market.DAO;

import java.util.HashSet;

import com.esprit.market.domain.Product;

public interface ProductDao {

	public void addProduct();

	public void deleteProduct();

	public void updateproduct();

	public Product getProductById();

	public HashSet<Product> listProduct();

}
