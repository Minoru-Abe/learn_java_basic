package com.abe.java_basic.interfacesample;

public class Developer {
	
	private Computer comp;
	
	public Developer(Computer comp) {
		this.comp = comp;
	}
	
	public void coding() {
		comp.coding();
	}

}
