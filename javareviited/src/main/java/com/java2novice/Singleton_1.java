package com.java2novice;

public class Singleton_1 {

	private static Singleton_1 s1  = null;
	int count = 0;
	
	Singleton_1(){
//		s1 = new Singleton_1();
		this.count++;
		System.out.println(" object is created "+count + " times ");
	}
	public static Singleton_1 getInstance(){
		s1 = new Singleton_1();
		return s1;
	}
	public static void main(String riut[]){
		
		Singleton_1  new_s_1 = new Singleton_1();
		Singleton_1  new_s_2 = new Singleton_1();
	}
}
