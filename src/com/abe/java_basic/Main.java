package com.abe.java_basic;

import java.util.ArrayList;
import java.util.List;

import com.abe.java_basic.text3_8.Hero;

public class Main {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		heros.add(new Hero("Saito"));
		heros.add(new Hero("Suzuki"));

		for (Hero h : heros) {
			System.out.println(h.getName());
		}
	}

}
