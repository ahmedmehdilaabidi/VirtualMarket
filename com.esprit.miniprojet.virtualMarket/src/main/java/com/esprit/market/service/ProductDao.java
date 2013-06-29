package com.esprit.market.service;

import java.util.HashSet;
import java.util.List;

import com.esprit.market.domain.Product;

public interface ProductDao {

	public void addProduct(Product p);

	public void deleteProduct(Product p);

	public void updateproduct(Product p);

	public Product getProductById(int id);

	public List<Product> listProduct();

}
