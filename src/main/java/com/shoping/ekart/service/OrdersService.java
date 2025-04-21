package com.shoping.ekart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shoping.ekart.exceptionhandler.ResourceNotFoundEception;
import com.shoping.ekart.modul.OrdersData;
import com.shoping.ekart.modul.Product;
import com.shoping.ekart.repository.OrdersRepo;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepo repo;
	

	public List<OrdersData> postOrders(List<OrdersData> orderData) {
		return repo.saveAll(orderData);
	}

	public List<OrdersData > getOrders() {
		return  repo.findAll();
	}


	public Object updateOrder(Long orderId, OrdersData product) {
		OrdersData findedOrder = repo.findById(orderId)
				.orElseThrow(()-> new ResourceNotFoundEception("Not found this id "+orderId ));
		findedOrder.setOrderStatus(product.getOrderStatus());
		return repo.save(findedOrder);
	}

	


}
