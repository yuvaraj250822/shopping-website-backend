package com.shoping.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoping.ekart.modul.OrdersData;

@Repository
public interface OrdersRepo extends JpaRepository<OrdersData, Long> {

}
