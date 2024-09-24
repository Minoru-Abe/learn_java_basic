package com.abe.java_basic.thread;

public class ThreadB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("ThreadB");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
