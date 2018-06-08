package javareviited.array;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Average_array {

	@Test
	public void dn(){
	//public static void main(String iut[]){
		 Scanner scn=new Scanner(System.in);
		 float sum=0f;
		 System.out.println("enter the length of an array ");
		 int[]  length=new int[scn.nextInt()];
		 System.out.println("enter the number to form an array  ");
		 for(int i=0;i<length.length;i++){
			 length[i]=scn.nextInt();
		 }
		 for(int i=0;i<length.length;i++){
			 sum+=length[i];
		 }System.out.println("average = "+ sum/length.length);
				 
	}
}
