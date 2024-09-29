package com.abe.java_basic.text6_5;

public class FuncListMain {
	public static void main(String[] args) {
		Func1 func1 = FuncList::isOdd;

		FuncList funcList = new FuncList();
		Func2 func2 = funcList::addNamePrefix;

		System.out.println(func1.isOdd(3));
		System.out.println(func2.addNamePrefix(true, "BEBE"));
		
		Func1 func1_2 = i -> i%2 == 1;
		
		Func2 func2_2 = (male, name) -> {
			if (male) {
				return ("Mr." + name);
			}else {
				return ("Ms." + name);
			}
		};
		
		System.out.println(func1_2.isOdd(3));
		System.out.println(func2_2.addNamePrefix(true, "BEBE"));
		
		
		
	}

}
