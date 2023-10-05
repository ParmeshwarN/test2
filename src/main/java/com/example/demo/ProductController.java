package com.example.demo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	@ResponseBody
	public Product addProduct(@RequestBody Product prod) {
		
		return service.addProduct(prod);
	}
	
	@PutMapping("/updateProduct")
	@ResponseBody
	public Product updateProduct(@RequestBody Product prod) {
		
		return service.updateProduct(prod);
	}
	
	
	@GetMapping("/getProducts")
	//@ResponseBody
	public List<Product> getProducts() {
		
		return service.getProducts();
	}
	
	@GetMapping("/getProduct")
	@ResponseBody
	public Optional<Product> getProduct(@RequestParam Integer id) {
		
		return service.getProduct(id);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
//	@ResponseBody
	public void deleteProduct(@PathVariable Integer id) {
		
	 service.deleteProduct(id);
	 
	}
	@GetMapping("/getProductByName/{prodName}")
	public Optional<Product> getProductByName(@PathVariable String prodName) {
		return service.getProductByName(prodName);
	}
}
