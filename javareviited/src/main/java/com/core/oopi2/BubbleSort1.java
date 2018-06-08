package com.core.oopi2;

public class BubbleSort1 {


		public static void getMeSorted(int[] arr){
			for(int t=0;t<arr.length-1;t++){
			for(int o=0;o<arr.length-t-1;o++){
				int temp;
				if(arr[o]>arr[o+1]){
					temp=arr[o];
					arr[o]=arr[o+1];
					arr[o+1]=temp;
				}
			}
		  }
		}
		public static void printArray(int[] arr){
			for(int i:arr){
				System.out.println(i);
			}
		}
		public static void main(String irut[]){
			int[] arr={4,2,22,5,8,7,452,32,1};
			BubbleSort1.getMeSorted(arr);
			printArray(arr);
		}
	
}
