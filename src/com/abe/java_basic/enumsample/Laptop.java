package com.abe.java_basic.enumsample;

public enum Laptop {
	Macbook(2000), Surface(1000), Letsnote, VAIO(1500);
	
	private int price;
	
	private Laptop() {
		price = 500;
	}
	
	private Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
