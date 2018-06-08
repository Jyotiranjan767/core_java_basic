package com.java2novice;

public class Top_two_max {

		public static void top_two_max(int[] du){ 
			int max_first  = 0 ;
			int max_second = 0 ; //Integer.MIN_VALUE;
			for(int d : du){
				if(max_first < d){
					max_second = max_first;
					max_first = d;
				}else if(max_second < d)
					max_second = d;
			}
			System.out.println("max first "+ max_first);
			System.out.println("max second "+max_second);

			
//			for (int i = 0; i < du.length; i++) {
//				if(du[i] > max_second)
//					max_second = du[i];
//			}
//			for(int iu : du)
//				System.out.println(iu);
//			System.out.println(max_second);
		}
		public static void main(String ritu[]){
			
			int[] d1 = {1,2,3,7,6,5,4,3};
			top_two_max(d1);
		}
}
