package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

@Autowired
private ProductRepository repo;

public Product addProduct(Product prod) {
	return repo.save(prod);
}
public Product updateProduct(Product prod) {
	return repo.save(prod);
}
public List<Product> getProducts(){
	return repo.findAll();
}

public Optional<Product> getProduct(Integer id) {
	return repo.findById(id);
}

public void deleteProduct(Integer id) {
	 repo.deleteById(id);
	 System.out.println("product deleted");
}

public Optional<Product> getProductByName(String prodName) {
	return repo.findByProdName(prodName);
}

}
