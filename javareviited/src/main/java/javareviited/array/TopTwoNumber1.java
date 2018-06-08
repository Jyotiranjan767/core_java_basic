package javareviited.array;

import java.util.Scanner;

public class TopTwoNumber1 {
	
	
	public static void main(String ri[]){
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the array length ,,,");
		int len=scn.nextInt();
		int[] sd=new int[len];
		System.out.println("enter "+len  +" number of integers one  by one ");
		for(int i=0;i<sd.length;i++){
			sd[i]=scn.nextInt();
		}
		twoMax(sd);
	}

	public static void twoMax(int[] sd){
	
		int maxOne=Integer.MIN_VALUE;
		int maxTwo=Integer.MIN_VALUE;
		for(int i=0;i<sd.length;i++){
			if(sd[i] > maxOne){
				maxTwo=maxOne;
				maxOne=sd[i];
			}else{
				if(maxTwo<sd[i]){
					maxTwo=sd[i];
			    	}			
				}
				
		}System.out.println("max =" +maxOne  +"  second Max = "+ maxTwo);
		
	}
}
