package com.shoping.ekart.modul;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cart")
public class Cart {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long cartId;
		private int id;
		private int quantity;
		private int price;
		private String name;
		private String imageUrl;		
}
