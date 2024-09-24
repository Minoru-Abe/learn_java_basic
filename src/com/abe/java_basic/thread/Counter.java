package com.abe.java_basic.thread;

public class Counter {
	private int count;
	
	public Counter(int count) {
		this.count = count;
	}
	
	public synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}
