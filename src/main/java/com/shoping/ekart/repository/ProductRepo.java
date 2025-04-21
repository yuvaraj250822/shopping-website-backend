package com.shoping.ekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.ekart.modul.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
