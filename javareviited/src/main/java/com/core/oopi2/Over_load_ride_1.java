package com.core.oopi2;

public class Over_load_ride_1 {
	
	public static void main(String sod[]){
		
//		Derive_1 b =(Derive_1) new Base(); it will show ClassCastExeption in run time 
//		b.method4("luckie");
		
		Derive_1 d = (Derive_1)new Base();
		System.out.println(d.i);
	}
}
	
	class Base{
		
		int i = 10;
		String str  = "Luckie";
		public void method1(String d){
			System.out.println("from base class  : "+d);
		}
		public void method4(String d){
			System.out.println("from parent class method4 "+d );
		}
	
}class Derive_1 extends Base{
	int i = 12;
	String str ;
	public  void method1(String r){  // return-type  also counts in method overridden 
		System.out.println("from child class : "+r);
//		return r;
	}
	public String method2(String f){
		return f;
	}
	public void method4(String d){
		System.out.println("from child class method4 "+d );
	}
}
