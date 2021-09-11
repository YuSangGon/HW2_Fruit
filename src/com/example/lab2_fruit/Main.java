package com.example.lab2_fruit;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fuit List {ordered by name)");
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2);
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "WaterMelon", 20000));
		fl.add(new Fruit(105, "Strawberry", 100));
		fl.add(new Fruit(106, "Blueberry", 5000));
		fl.add(new Fruit(107, "Melon", 6000));
		fl.add(new Fruit(108, "Peach", 3000));
		fl.add(new Fruit(109, "Banana", 1500));
		fl.add(new Fruit(110, "Lemon", 2000));
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
	}

}
