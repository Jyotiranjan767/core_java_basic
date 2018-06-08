package javareviited.miscella;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String uriq[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number ");
		System.out.println("Factorial is : "+facto(scn.nextInt()));
	}
	
	public static int facto(int number){
	 if(number==1|| number ==0) return 1;
	 else
		return number *facto(number-1);
	}
}
