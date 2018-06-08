package com.core.oopi2;

public class Poly_instance_of1 {
	
	public static void main(String irtu[]){
//		Male m=(Male)new Human();
//		m.gender();
		
		Human h=new Male();
		Male.gender(h);
		
	}
}

class Human{
	
	int i=10;
	public static void gender(Human h){
		
		System.out.println("specify it ");
	}
}
class Male extends Human{
	int j=30;
	 public static void gender(Human h){
		
		if(h instanceof Male){
				Male m1=(Male)h;
			System.out.println( m1.j+" manly melon");
		}
		
	}
}
