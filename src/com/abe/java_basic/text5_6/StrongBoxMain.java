package com.abe.java_basic.text5_6;

public class StrongBoxMain {
	public static void main(String[] args) {
		StrongBox<Integer> box = new StrongBox<Integer>(KeyType.PADLOCK);
		Integer integer = 7;
		box.put(integer);
		
		for (int i = 0; i < 1026; i++) {
			System.out.println(box.get());
		}
		
		
	}

}
