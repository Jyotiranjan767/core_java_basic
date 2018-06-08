package com.advanced.lynda.testing.assert_1;


public class Main_assert {
	
	public static void main(String ir[]){
		assert true;
		String s1  = InputHelper.getInput("enter a numeric value : ");
		assert checkInput(s1);
		String s2  = InputHelper.getInput("enter a numeric value  ");
		assert checkInput(s2);
		String op1 = InputHelper.getInput("choose an operator  + or - or * or /");
		
		long result = 0;
		
		switch(op1){
		case "+":result = MathHelper.addValues(s1, s2);break;
		case "-":result = MathHelper.subValues(s1, s2);break;
		case "*": result = MathHelper.mulValues(s1, s2);break;
		case"/": result = MathHelper.divValues(s1, s2);break;
		default :
			System.out.println("you just entered an invalid operator ,");
		}
		System.out.println("result = "+ result);
	}
	private static boolean checkInput(String s){
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
}
