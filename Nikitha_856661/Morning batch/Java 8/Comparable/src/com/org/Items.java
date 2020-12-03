package com.org;

public class Items implements Comparable<Items>{

	
	private int id;
	private String itenName;
	private int price;
	public Items(int id, String itenName, int price) {
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Items args0) {
		// TODO Auto-generated method stub
		
		return this.itenName.compareTo(args0.getItenName());  // sort according to item name
		//return this.price-args0.getPrice();    sort according to price
		//return this.id-args0.getId();     sort according to id
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Items (id=" + id + ", name=" + itenName + ", price=" + price + ")";
	}
	
}

