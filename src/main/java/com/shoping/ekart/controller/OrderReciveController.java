package com.shoping.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.ekart.modul.OrdersData;
import com.shoping.ekart.modul.Product;
import com.shoping.ekart.service.OrdersService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://easytobuyonline.netlify.app")
public class OrderReciveController {
	
	
	@Autowired
	private OrdersService service;
	
	@PostMapping("/products/order/place")
	public ResponseEntity<List<OrdersData>>   postOrders(@RequestBody List<OrdersData> orderData) {
		return new ResponseEntity<>(service.postOrders(orderData),HttpStatus.CREATED)   ;
		
	}
	
	@GetMapping("/products/order/details")
	public ResponseEntity<List<OrdersData>>  getOrders() {
		return new ResponseEntity<>(service.getOrders(),HttpStatus.OK) ;
	}
	
	@PutMapping("/products/order/{orderId}")
	public ResponseEntity<?> updateOrders(@PathVariable Long orderId , @RequestBody OrdersData product  ) {
		return	new ResponseEntity<>(service.updateOrder(orderId,product),HttpStatus.ACCEPTED);
		
	}
}
