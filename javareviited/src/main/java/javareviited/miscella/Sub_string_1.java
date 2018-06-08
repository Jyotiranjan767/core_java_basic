package javareviited.miscella;

import java.util.ArrayList;
import java.util.List;

public class Sub_string_1 {
		
		 static String sub_string(String str, int start, int end){
			List<Character> sub = new ArrayList<>();
			char[] cA = str.toCharArray();
//			 l: 
			for(int i = 0; i<str.length(); i++){
				if(i >= start && i < end){
					sub.add(cA[i]);
//					i++;
//					continue l;
				} 
			}
			return sub.toString();
		}
		 public static void main(String irtu[]){
			
			System.out.println(sub_string("Jyoti loves Luckie",4,13));
		}
}
