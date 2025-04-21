package com.shoping.ekart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoping.ekart.exceptionhandler.ResourceNotFoundEception;
import com.shoping.ekart.modul.Product;
import com.shoping.ekart.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo ;

	public List<Product> getProduct() {
		return repo.findAll();
	}

	public Product addProduct(Product product) {
		return repo.save(product);
	}

	public Product getProductById(Long proid) {
		return repo.findById(proid).orElseThrow(()-> new ResourceNotFoundEception("not found this id"+proid));
	}
}
