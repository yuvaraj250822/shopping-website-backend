package com.shoping.ekart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoping.ekart.exceptionhandler.ResourceNotFoundEception;
import com.shoping.ekart.modul.Cart;
import com.shoping.ekart.repository.CartRepo;

@Service
public class CartService {
	@Autowired
	private CartRepo repo;

	public Cart postCart(Cart cart) {
		return repo.save(cart);
	}

	public List<Cart> getCart() {
		return repo.findAll();
	}

	public void deleteCart(Long cartId) {
//		Cart delete =repo.findById(cartId).orElseThrow(()-> new ResourceNotFoundEception("not found" + cartId));
		repo.deleteById(cartId);
	}
	
	public void deleteCartAll() {
		repo.deleteAll();
	}
	

	public Cart updateCart(Long cartId, Cart cart) {
		Cart update = repo.findById(cartId).orElseThrow(()-> new ResourceNotFoundEception("not found" + cartId));
			update.setImageUrl(cart.getImageUrl());
			update.setName(cart.getName());
			update.setQuantity(cart.getQuantity());
			update.setPrice(cart.getPrice());
			return update;
		
	}
	
	
}
