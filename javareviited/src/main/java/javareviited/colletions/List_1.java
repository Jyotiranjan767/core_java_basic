package javareviited.colletions;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
	
		public static void main(String ir[]){
			
			List<String> st = new ArrayList<>();
			st.add("fls");
			st.add("wfldsas");
			st.add("tfls");
			st.add("3fls");
			st.add("Kfls");
			System.out.println(st);
			
			for(String s :  st)
				System.out.println(s);
		}
}
