package javareviited.miscella;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int number){
		
		int sqrt=(int)Math.sqrt(number);
	//	System.out.println(sqrt);
		for(int i=2;i<=sqrt;i++){
			if(number %i==0){
				return true;
			}
			
		}return false;
		}
	public static void primeNumberInBetween(int start ,int end){
		
		int count =0;
		int[] cou=new int[end/2];
		try{
			for(start = start; start<=end;start++){
				if(!isPrime(start)){
					count++;
					System.out.println("####################"+start);
					cou[count]=start;
					if(start==end) break;
				}
			}
		}catch(Exception uf){
				System.out.println("excepiton raised ");
			}
				
				
		int i=0;
		for(int f:cou){
			
		//System.out.println(f+" \t "+i);
		i++;
		}System.out.println();
		System.out.print(count);
	}
	
	public static void main(String iri[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("hit a number check");
		int number =scn.nextInt();
		if(!isPrime(number)){
			System.out.println(number +" is a prime number ");
		}else 
			System.out.println("sorry, what u found was not a prime number ");
		
		System.out.println("draw a boundary by putting two values");
		
		primeNumberInBetween(scn.nextInt(),scn.nextInt());
	}
	
}
