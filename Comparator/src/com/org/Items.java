package com.org;

public class Items {

	private int id;
	private String itenName;
	private double price;
	public Items(int id, String itenName, double price) {
		super();
		this.id = id;
		this.itenName = itenName;
		this.price = price;
	}
	public Items() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItenName() {
		return itenName;
	}
	public void setItenName(String itenName) {
		this.itenName = itenName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Items (id=" + id + ", name=" + itenName + ", price=" + price + ")";
	}

}
