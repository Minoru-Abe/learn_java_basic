package com.abe.java_basic.silver9_13;

import java.util.ArrayList;
import java.util.List;

public class Silver9_13 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		for (String str : list) {
			if (str.equals("B")) {
				list.remove(str);
			}else {
				System.out.println(str);
			}
				
		}
	}

}
