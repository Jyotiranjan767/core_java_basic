package javareviited.colletions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CharacterRepeatance {
	
	public static void main(String eir[]){
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a line ,,,,");
		String se=scn.nextLine();
		charReapeat(se);
	}

	public static  void charReapeat(String st){
		
		Map<Character,Integer> map=new HashMap<>();
		Integer count;
		char c=' ';
		for(int i=0;i<st.length();i++){
			c=st.charAt(i);
			count=map.get(c);
			if(count==null) { 
				count=0;
			}
			System.out.println(count  +" *** "+c+" in for loop");
			map.put(c, count+1);
		}
		Set<Character> set=map.keySet();
		for(Character cc:set){
			System.out.println(cc +" occured at "+ map.get(cc)+" times ");
		}
	}
}
