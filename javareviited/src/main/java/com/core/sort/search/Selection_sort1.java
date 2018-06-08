package com.core.sort.search;

public class Selection_sort1 {

	public static void getSelected(int[] s){
		
		for (int i = 0; i < 6; i++) {
			int min_index=i;
			for(int j=i+1;j<s.length;j++)
			if(s[min_index]>s[j])
				min_index=j;
			int temp=s[min_index];
			s[min_index]=s[i];
			s[i]=temp;
		}
		for(int i:s)
			System.out.println(i);
	}
	
	public static void main(String ir[]){
		int[] s={2,5,8,1,3,4,7,6};
		getSelected(s);
	}
}
