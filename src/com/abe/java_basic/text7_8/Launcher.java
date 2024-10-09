package com.abe.java_basic.text7_8;

public class Launcher {
	public static void main(String[] args) throws Exception{
		String fqcn = args[0];
		String invoke = args[1];
		
		long free = Runtime.getRuntime().freeMemory() / 1024 / 1024;
		long max = Runtime.getRuntime().maxMemory() / 1024 / 1024;
		
		System.out.println("Available memory : " + (max - free));
		
		Class<?> cinfo = Class.forName(fqcn);
		
		
	}
}
