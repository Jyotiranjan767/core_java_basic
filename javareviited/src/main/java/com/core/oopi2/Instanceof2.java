package com.core.oopi2;

public class Instanceof2 {
	
	public static void main(String fdi[]){
		Animal2 a2=new Cat();
		a2.insta1(a2);
		a2.insta2(a2);
		a2.insta3(a2);
	}
	
}
class Animal2{
	public void insta1(Animal2 a2){
		if(a2 instanceof Animal2)
		System.out.println("insta1");
	}
	
	public void insta2(Animal2 a2){
		if(a2 instanceof Animal2)
		System.out.println("insta2 animal2");
	}
	public void insta3(Animal2 a2){
		System.out.println("ei");
	}
}
class Doggy extends Animal2{
	public void insta2(Animal2 a2){
		if(a2 instanceof Doggy)
			System.out.println("insta2 doggy");
	}
}
class Cat extends Animal2{
	public void insta3(Animal2 a2){
		if(a2 instanceof Cat){
			System.out.println("insta 3 cat");
		}
	}
}
