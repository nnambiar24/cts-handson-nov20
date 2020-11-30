package com.org;

public class Address {

	private int accNo;
	private String name;
	public Address(int accNo, String name) {
		super();
		this.accNo = accNo;
		this.name = name;
	}
	public Address() {
		super();
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Address [accNo=" + accNo + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		
		return accNo;
	}
	@Override
	public boolean equals(Object obj) {
		Address other=(Address)obj;
		return this.accNo==other.getAccNo();
	}
	
	
}
