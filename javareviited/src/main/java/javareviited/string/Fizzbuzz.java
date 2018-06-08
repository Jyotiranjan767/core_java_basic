package javareviited.string;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

public class Fizzbuzz {

	private static final Logger logger=Logger.getLogger(Fizzbuzz.class.getName());
	public static void main(String sduia[]){
		
		Scanner scn=new Scanner(System.in);
		logger.info("input an integer to check fizzbuzz");
		int ie=scn.nextInt();
		logger.info(fizzing(ie));
	}
	public static String fizzing(int number){
		
		if(number%15==0) return "fizzbuzz";
		else if(number%3==0) return "fizz";
		else if(number%5==0) return "buzz";
		else return Integer.toString(number);
		
	}
	public static String fizzbuzzSolutionJava8(int input){
		return Optional.of(input)
			.map(i ->{
				if(i%(3*5)==0)) return "fizzbuzz";
		else if(i%3==0) return "fizz";
		else if(i%5==0) return "buzz";
		return Integer.toString(i)
				}).get();	
		}
	}
}
