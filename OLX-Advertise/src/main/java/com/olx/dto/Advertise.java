package com.olx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public class Advertise {
	private String title;
	private int price;
	private int catId;
	private String desc;
	public Advertise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Advertise(String title, int price, int catId, String desc) {
		super();
		this.title = title;
		this.price = price;
		this.catId = catId;
		this.desc = desc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Advertise [title=" + title + ", price=" + price + ", catId=" + catId + ", desc=" + desc + "]";
	}
	
	
	
}
