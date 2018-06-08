package javareviited.array;

import java.util.Scanner;

public class MaxTwoNumber_2 {

	public static void maxTwo(int[] arr){
		int min = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>min){
				max = min;
				min = arr[i];
			}
			else{
				if(arr[i]>max){
				max = arr[i];
			 }
			}
			
//		System.out.println(max);
				
		}
		System.out.println("max :"+min + " second max : "+ max);
	}
	public static void main(String fd[]){
//		Scanner scn = new Scanner(System.in);
		int[] arr =new int[7];
		arr[0] = 112;
		arr[1] = 11;
		arr[2] = 2112;
		arr[3] = 3;
		arr[4] = 1212;
		arr[5] = 18;
		arr[6] = 4;
		
		maxTwo(arr);
//		System.out.println(maxTwo(arr));
		
	}
}
