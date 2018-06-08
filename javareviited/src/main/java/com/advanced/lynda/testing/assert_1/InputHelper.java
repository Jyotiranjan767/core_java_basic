package com.advanced.lynda.testing.assert_1;

import java.util.Scanner;

public class InputHelper {

	public static String  getInput(String str){
		Scanner scn =new Scanner(System.in);
		System.out.println(str);
		String s = scn.next();
		return s;
	}

	
	
	/*	public static String getInput(String sd ){
		Scanner scn =new Scanner(System.in);
		String s1  = scn.next();
		return s1;
	}*/
}
