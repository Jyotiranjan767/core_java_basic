package com.java2novice;

public class Perfect_number_1 {

	public static void perfectNumber(int number){
		boolean flag = false;
		int sum = 0 ;
		for(int i = 1 ; i <= number/2; i++){
			if(number % i == 0){
				sum += i;
			}
		}if(sum == number)
			flag = true; 
		if(flag)
			System.out.println(number +" is a perfect number ");
		else System.out.println(number + " is not a perfect number ");
	}
	public static void main(String ut4ot[]){
		perfectNumber(26);
	}
}
