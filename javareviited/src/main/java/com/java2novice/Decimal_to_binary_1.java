package com.java2novice;

public class Decimal_to_binary_1 {
	
	
		public static int deci_to_bi(int number){
			StringBuffer  s = new StringBuffer();
			int rem = 0 ;
			while(number >= 1){
				rem = ( number % 2) ;
				number /= 2 ;
				s.append(rem);
			}//return Integer.parseInt(s.toString());
			return reverse(Integer.parseInt(s.toString()));
		}
		public static int reverse(int number){
			StringBuffer sb = new StringBuffer();
			while(number >= 1){
				long rem = number % 10;
				number /= 10;
				sb.append(rem);
//				System.out.print(rem);
			}return Integer.parseInt(sb.toString());
		}
		public static void main(String iru[]){
			System.out.println(deci_to_bi(123));
		}
}
