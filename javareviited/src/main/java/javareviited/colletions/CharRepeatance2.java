package javareviited.colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class CharRepeatance2 {

/*	public static void intRepeat1(int[] ei1,int[] ei2){
	Map<Integer,Integer> rep=new HashMap<>();
		int i,k=0,count=0;
		for ( i = 0; i < ei1.length; i++)
			count=rep.get(i);
			rep.put(count, ei1[i]);
			for (int j = i; j < ei2.length+i; j++) {
//				System.out.println("j="+j+"\t i="+i+"\t k="+k);
				rep.put(j, ei2[k]);
				k++;
			}
		Set<Map.Entry<Integer,Integer>> se=rep.entrySet();
		for(Map.Entry<Integer, Integer>dg:se)
			System.out.println("index is "+dg.getKey()+" with values "+dg.getValue());
	}
	public static void main(String fduiP[]){
		int[] ei1={3,2,7,8};
		int[] ei2={4,3,7,9};
		intRepeat1(ei1,ei2);
	}*/
	
	
	public static void chrRpt(){
		Map<Character,Integer> mp=new HashMap<>();
		Integer count;
		String str="simplilearn";
		char[] ds=str.toCharArray();
		char c=' ';
		for(int i=0;i<str.length();i++){
			c=str.charAt(i);
			count=mp.get(c);
			if(count==null )
				count=0;
//			System.out.println(count+" in for loop");
			mp.put(c, count+1);
		}
		Set<Character > e=mp.keySet();
		List<Character> lst=new ArrayList<>(e);
		Collections.sort(lst);
//		System.out.printf("modified e :%s " ,Arrays.toString(e.toArray()));
		for (int i = 0; i <lst.toArray().length; i++) {
			System.out.println("$@$@   "+lst.toArray()[i]);
		}
		for(Character cc:lst){
//		for(int i=0;i<e.toArray().length;i++){
//			
//			Character cc=(Character) e.toArray()[i];
			System.out.println("repeatacne of "+cc+" is "+mp.get(cc)+" times");
		}
	}
	public static void  main(String irtu[]){
		chrRpt();
	}
}