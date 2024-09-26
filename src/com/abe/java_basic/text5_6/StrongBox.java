package com.abe.java_basic.text5_6;

public class StrongBox<E> {
	private E obj;
	
	public void put(E obj) {
		this.obj = obj;
	}
	
	public E get() {
		return this.obj;
	}

}
