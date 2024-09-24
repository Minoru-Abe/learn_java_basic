package com.abe.java_basic.text3_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeroMain {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<>();
		
		Hero saito = new Hero("Saito");
		Hero suzuki = new Hero("Suzuki");
		
		heros.add(saito);
		heros.add(suzuki);
		
		for (Hero h : heros) {
			System.out.println(h.getName());
		}
		
		Map<Hero, Integer> defeats = new HashMap<Hero, Integer>();
		defeats.put(saito, 3);
		defeats.put(suzuki, 7);
		
		for (Hero h : defeats.keySet()) {
			Integer enemy = defeats.get(h);
			System.out.println(h.getName() + " defeated " + enemy);
		}
		
		
	}

}
