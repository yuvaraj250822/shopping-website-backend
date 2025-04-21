package com.shoping.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.ekart.modul.Cart;
import com.shoping.ekart.service.CartService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://easytobuyonline.netlify.app")
public class CartController {
	@Autowired
	private CartService service;
	
	@PostMapping("/cart/add")
	public ResponseEntity<Cart>  postCart(@RequestBody Cart cart) {
		return new ResponseEntity<>(service.postCart(cart),HttpStatus.CREATED);
	}
	
	@GetMapping("/cart/details")
	public ResponseEntity<List<Cart>>  getCart() {
		return new ResponseEntity<>(service.getCart(),HttpStatus.OK) ;
	}
	
	@PutMapping("/cart/updatecart/{cartId}")
	public ResponseEntity<Cart> updateCart(@PathVariable Long cartId, @RequestBody Cart cart ){
		return new ResponseEntity<>(service.updateCart(cartId,cart),HttpStatus.FOUND);
		
	}
	
	@DeleteMapping("/cart/{cartId}")
	public ResponseEntity<?> deleteCart(@PathVariable Long cartId) {
		service.deleteCart(cartId);
		return  new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/cart/clearAll")
	public void deleteCartAll() {
		service.deleteCartAll();
	}
}
