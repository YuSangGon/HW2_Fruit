package com.example.lab2_fruit;

import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	class FruitComparator implements Comparator<Fruit>{
		public int compare(Fruit o1, Fruit o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	class FruitComparatorDesc implements Comparator<Fruit>{
		public int compare(Fruit o1, Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
	}
	
	public Fruit(int no, String name, int price) {
		setNo(no);
		setName(name);
		setPrice(price);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return no + " " + name + " " + price;
	}
}
