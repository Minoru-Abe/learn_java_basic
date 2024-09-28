package com.abe.java_basic.text5_6;

public class StrongBox<E> {
	private E obj;
	private KeyType keyType;
	private int attempts;
	
	public StrongBox(KeyType keyType) {
		this.keyType = keyType;
	}
	
	public void put(E obj) {
		this.obj = obj;
	}
	
	public E get() {
		attempts++;
		
		if (attempts >= keyType.getRequiredAttempts()) {
			return this.obj;	
		}
		else {
			return null;
		}
		
	}

}
