package com.core.oopi2;

public class PolyMism1 {
	
	
	public static void main(String dis[]){
		
//		Dog ani=(Dog)new Animal(); //down casting is not supported in Java 
//		ani.getLegs();// since it shows an error
		
		Animal an = new Dog();
		an.getLegs(); //shows the method of Child class here is Dog class
		
		Dog dg =  new Dog();
		dg.getLegs();
		
		int i=9;
		double d=24.4287;
		i=(int)d;
		System.out.println(i);
	}

}

class Animal {
	
	public void getLegs(){
		System.out.println("approx 8");
	}
}

class Dog extends Animal{
	
	public void getLegs(){
		
		System.out.println("exact 4"); 
		
	}
}
