package com.aspart.art.items;

public class Item {

	String name;
	int price;
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
	
	public Item(String name, int price){
		this.name = name;
		this.price = price;
		
	}
	
	private static void main() {
		Item lifePotion = new Item("lifePotion", 50);
		Item grassShoes = new Item("grassShoes", 300);
		Item sword = new Item("sword", 350);
	}
}
