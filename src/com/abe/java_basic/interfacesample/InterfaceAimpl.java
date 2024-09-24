package com.abe.java_basic.interfacesample;

public class InterfaceAimpl implements InterfaceA{
	public void show() {
		System.out.println("In InterfaceAimpl");
	}
	
	public int calc(int a, int b) {
		return a + b;
	}

}
