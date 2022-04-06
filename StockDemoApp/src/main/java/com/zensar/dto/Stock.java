package com.zensar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Stock {
	
	private int Id;
	private String name;
	private String market;
	private int price;
	
	public Stock(int Id,String name, String market, int price) {
		super();
		this.Id = Id;
		this.name = name;
		this.market = market;
		this.price = price;
	}
	public Stock() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Stock [Id=" + Id + ", name=" + name + ", market=" + market + ", price=" + price + "]";
	}

	
	
	
}
