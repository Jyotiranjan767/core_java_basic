          package com.core.oopi2;

public class InsertionSort1 {

	public static void main(String irtu[]){
		
		int[] arr={9,8,7,6,5,4,3,2,1,0};
		insertionSort(arr);
		printArray(arr);
	}
	
	public static void insertionSort(int arr[]){
		
		int key;
		for(int i=1;i<arr.length;i++){
			key=arr[i];
			int j=i-1;
			
			while(j>=0   &&  arr[j]>key){
				arr[j+1]=arr[j];
				j-=1;
			}
			arr[j+1]=key;
			
		}
	}
	static void printArray(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
