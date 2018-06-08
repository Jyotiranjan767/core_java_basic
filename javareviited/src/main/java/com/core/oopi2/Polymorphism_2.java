package com.core.oopi2;

public class Polymorphism_2 {

	public static void main(String sdojp[]){
		
		Animal_1 as=new Dog_1();
		as.getSound(); //dogs sounds like bow bow
		
		System.out.println(as.i+"   "+as.animal);
		
		Dog_1 dg1=(Dog_1)new Animal_1();
		System.out.println(dg1.i);
    	dg1.getSound(); //ClassCastException arises
		
		
	}
}

class Animal_1{
	
	public int i=100;
	String animal="animal";
	public void getSound(){
		System.out.println("define animal please ");
	}
}
class Dog_1 extends Animal_1{
	
	public int i =30;
	String dog="dog";
	public void getSound(){
		System.out.println("Dog sounds like bow bow ");
	}
	public void only_in_dog(){
		System.out.println("only available in Dog class ");
	}
}
