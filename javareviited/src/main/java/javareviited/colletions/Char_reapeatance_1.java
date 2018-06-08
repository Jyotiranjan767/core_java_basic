package javareviited.colletions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Char_reapeatance_1 {

	public static void main(String ddsd[]){
		repeat_char("jyoti jotika");
	}
	
	public static void repeat_char(String str){
		Integer count ;
		Map<Character , Integer> mc = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
//			System.out.println(c);
//			if(mc.containsKey(c)){
////				mc.put(c, mc.get(c)+1);
//			}else count = 1;
//			mc.put(c, count);
		count = mc.get(c);
		if(count == null)
			count = 0;
		mc.put(c, count+1);
		}
//		System.out.println(mc);
		Set<Character> cc = mc.keySet();
		for(Character c:cc){
			System.out.println(c +" occurs in "+ mc.get(c) + " times."  );
		}
	}
	
}
