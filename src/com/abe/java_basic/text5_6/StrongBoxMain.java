package com.abe.java_basic.text5_6;

public class StrongBoxMain {
	public static void main(String[] args) {
		StrongBox<Integer> box = new StrongBox<Integer>();
		Integer integer = 7;
		box.put(integer);
		
		Integer integer2 = box.get();
		
	}

}
