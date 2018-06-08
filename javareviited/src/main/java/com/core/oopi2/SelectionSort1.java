package com.core.oopi2;

public class SelectionSort1 {

	public  static void sort(int ar[]){
		
		int dd[]=new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			
			int key=i;
			for (int j = i+1; j < ar.length; j++) {
				
				if(ar[key] >ar[j])
					key=j;
				
			}
			int temp=ar[key];
			ar[key]=ar[i];
			ar[i]=temp;
		}
	
	/*}
	static void display(int[] ds){
	*/	for(int i=0;i<ar.length;i++)
		System.out.println(ar[i]);
	}
	
	public static void main(String riut[]){
		
		int[] ar={9,3,8,4,8,31,5,1,4};
		sort(ar);
	   //display(ar);
	}
}
