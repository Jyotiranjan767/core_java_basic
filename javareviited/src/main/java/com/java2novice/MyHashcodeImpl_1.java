package com.java2novice;

import java.util.HashMap;

public class MyHashcodeImpl_1 {
	public static void main(String ieut[]){
		
		HashMap<Price, String> hm = new HashMap<>();
		hm.put(new Price("Banana", 20), "Banana");
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Orange", 30), "Orange");
		//creating  new object to use  as key to get value
		Price key = new Price("Banana", 20);
		System.out.println("Hashcode of the key :"+ key.hashCode());
		System.out.println("value from map :"+ hm.get(key));
	}
}

class Price{
	private String item;
	private int price;
	
	public Price(String item, int price){
		this.item = item;
		this.price = price;
	}
	public int hashCode(){
		System.out.println("in hashcode ");
		int hashCode = 0;
		hashCode = price * 20;
		hashCode += item.hashCode();
		return hashCode;
	}
	public boolean equals(Object obj){
		System.out.println("in equals ");
		if(obj instanceof Price){
			Price pp = (Price) obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
		}else{
			return false;
		}
	}
	public String getItem(){
		return item;
	}
	public void setItem(String item){
		this.item = item;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String toString(){
		return "item : " + item+ " price  : "+ price; 
	}
}