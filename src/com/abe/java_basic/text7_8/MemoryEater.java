package com.abe.java_basic.text7_8;

public class MemoryEater {
	public static void main(String[] args) {
		long[] longarray = new long[1280000];
		
		for (int i = 0; i < 1280000; i++) {
			longarray[i] = i;
		}

		
	}

}
