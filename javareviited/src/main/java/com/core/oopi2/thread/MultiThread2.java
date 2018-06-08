package com.core.oopi2.thread;

public class MultiThread2 {

	public static void main(String ir[]){
		Animal ani=new Animal();
		//Dog sd=(Dog) ani;
		//sd.song();
		//((Dog)ani).dif();
		//ani.song();
		
		Animal aC=new Dog();
		aC.song();
	}
}class Animal{

	public void song(){
		System.out.println("super class song");
	}
}



class Dog extends Animal{
	public void dif(){
		System.out.println("child class dog ");
	}
	
	public void song(){
		System.out.println("child class song");
	}
}

