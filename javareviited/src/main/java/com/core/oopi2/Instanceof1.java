package com.core.oopi2;

public class Instanceof1 {

			public static void main(String iru[]){
				
				Animal1 ani1=new Dog2();
				if(ani1 instanceof Dog1)
				ani1.getSound();
				
				ani1.getM(ani1);
				
				//ani1.difo();
			}
	
}

class Animal1{
	
	public void getSound(){
		System.out.println("all universal");
	}
	public void getM(Animal1 a){
		System.out.println(" i was forcefully created");
	}
}

class Dog1 extends Animal1{
	
	public void getSound(){
		System.out.println("all different");
	}
}

class Dog2 extends Animal1{
	
	public void getM(Animal1 a){
		
		if(a instanceof Dog2)
			System.out.println("make my trip");
		
	}
	public void difo(){
			System.out.println("it should never be seen in console and "
					+ "neither it can't be called by reference variable of super class.");
	}
}
