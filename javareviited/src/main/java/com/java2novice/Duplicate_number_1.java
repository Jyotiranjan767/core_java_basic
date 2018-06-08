package com.java2novice;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_number_1 {

	public static void main(String ritu[]){
		
		int[] iArr = {31,112,3,1,2,3,12,31,31,4,12,4,25};
		System.out.println(duplicate_numbers(iArr));
	}
	
	public static Set duplicate_numbers(int[] iArr){
		Set<Integer> set  = new HashSet<>();
		for(int i = 0; i < iArr.length; i++) {
			 for (int j = 0; j < iArr.length; j++) {
				if(i!=j){
					if(iArr[i] == iArr[j] ){
						set.add(iArr[i]);
					}
				}
			}
		}
		return set;
	}
}
