package com.advanced.lynda.testing.assert_1;

public class MathHelper {
	
	public static int  addValues(String  s1, String s2){
		try{
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			return a+b;
		}catch(NumberFormatException e){
			System.out.println("number entered is not an integer ");
			return 0;
		}
	}
	public static int  subValues(String s1, String s2){
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		if( a>b)return a-b;
		else if(b>a) return b-a;
		else return 0;
	}
	public static int  mulValues(String s1, String s2){
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		return a*b;
	}
	public static int  divValues(String s1, String s2){
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		return a/b;
	}
	
}
