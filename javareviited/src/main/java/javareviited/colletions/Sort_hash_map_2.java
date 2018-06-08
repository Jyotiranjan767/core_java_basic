package javareviited.colletions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sort_hash_map_2 {
		
		public static void main(String ri[]){
			Map<String , String> mp = new HashMap<>();
			mp.put("Django","light");
			mp.put("Flask", "heavy");
			mp.put("Bootstrap", "designing for forms and other functionalities of web");
			mp.put("git", "bit_bucket");
			mp.put("Postman", "API Testing and forming");
			
			System.out.println("sorted by random,,,");
			Set<Entry<String, String>> set = mp.entrySet(); 
//			System.out.println(set);
			System.out.println("tech{");
			for(Entry<String, String> ent : set)
				System.out.println(ent.getKey() +" : "+ent.getValue());
			System.out.println("}");
			
			System.out.println("Sorted by key , tree");
			
		}
}
