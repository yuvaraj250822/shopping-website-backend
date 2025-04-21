package com.shoping.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoping.ekart.modul.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Long> {

}
