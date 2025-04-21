package com.shoping.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.ekart.modul.Product;
import com.shoping.ekart.service.ProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://easytobuyonline.netlify.app")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>>  getproducts(){
		return  new ResponseEntity<> (service.getProduct(),HttpStatus.OK);
	}
	
	@GetMapping("/products/{proid}")
	public ResponseEntity<Product>  getProductById(@PathVariable Long proid) {
		return new ResponseEntity<>(service.getProductById(proid),HttpStatus.FOUND) ;
	}
	
	@PostMapping("/add")
	public Product postProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
}

