package com.java2novice;

public class Insertion_sort_1 {
	
	public static void main(String riut[]){
		int [] iArr1 = {2, 4, 9, 6, 23, 12, 34, 0, 1};
		insert_sort(iArr1);
	}

	public static void insert_sort(int[] iArr){
		
			int n = iArr.length;
			try{
				for (int i = 1; i <n; i++) {
					int key = iArr[i];
					int j = i-1;
					while(key < iArr[j] && j > -1){
						iArr[j+1] = iArr[j];
						j--;
					}iArr[j+1] = key;
					printNumbers(iArr);
				}
			}catch(ArrayIndexOutOfBoundsException e3 ){
				e3.printStackTrace();
			}
	}
	public static void printNumbers(int input[]){
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+  ", ");
		}System.out.println();
		
	}
}
