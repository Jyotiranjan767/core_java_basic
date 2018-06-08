package com.core.sort.search;

public class BubbleSort1 {

	public static void getBubble(int[] s){
		
		for (int i=0;i<s.length-1;i++){
			for(int j=0;j<s.length-i-1;j++){
			int temp;
			if(s[j]>s[j+1]){
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
			}
			
		}
	}	
			for(int i:s)
				System.out.println(i);
		}
	public static void main(String ritp[]){
		int[] s={2,5,8,1,3,4,7,6};
		getBubble(s);
	}
}
	