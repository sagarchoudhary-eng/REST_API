package com.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "items")
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @Getter @Setter Integer id ;
	private @Getter @Setter String name ;
	private @Getter @Setter int price;
	private @Getter @Setter String description;
	private @Getter @Setter Boolean available;
	
	public Items() {
		// TODO Auto-generated constructor stub
	}
	public Items(String name, int price, String description, Boolean available) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.available = available;
	}
	
	
}
