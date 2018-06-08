package com.java2novice;

public class Reverse_number_1 {

	public static void reverse(long number){
		
		while(number > 1){
			long rem = number % 10;
			number /= 10;
			System.out.print(rem);
		}
	}
	public static void main(String iru[]){
		
		reverse(2324244324224821723L);
	}
}
