package com.shoping.ekart.modul;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Product {

	@Id
	private Long id;
	private String name;
	private String title;
	private String category;
	private int offerprice;
	private int orginalPrize;
	private String image;
	private int delivery;
	
	

}
