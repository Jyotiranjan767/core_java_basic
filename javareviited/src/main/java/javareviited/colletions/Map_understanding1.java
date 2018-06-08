package javareviited.colletions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.testng.log4testng.Logger;

public class Map_understanding1 {

	public static void main(String irtp[]){
//		Logger log=Logger.getLogger(Map_understanding1.class);
		Scanner scn = new Scanner (System.in);
//		log.info("enter the size of 1st array,,,,");
		System.out.println("enter the  size  of array1");
		int size1 = scn.nextInt();
		int d1[]=new int[size1];//{2,3,5,8};
		for (int i = 0; i < d1.length; i++) {
			switch(i){
			case 1:
//				log.info
				System.out.println("enter "+i+"st element");
				d1[i]=scn.nextInt();
				break;
			case 2:
//				log.info
				System.out.println("enter "+i+"nd element");
				d1[i]=scn.nextInt();
				break;
			case 3:
//				log.info
				System.out.println("enter "+i+"rd element");
				d1[i]=scn.nextInt();
				break;
			default :
//				log.info
				System.out.println("enter "+i+"th element");
				d1[i]=scn.nextInt();
			}
		}
//		int[] d2={4,5,3,9};
		System.out.println("enter the  size  of array2");
		int size2 = scn.nextInt();
		int d2[]=new int[size2];//{2,3,5,8};
		for (int i = 0; i < d2.length; i++) {
			switch(i){
			case 1:
//				log.info
				System.out.println("enter "+i+"st element");
				d2[i]=scn.nextInt();
				break;
			case 2:
//				log.info
				System.out.println("enter "+i+"nd element");
				d2[i]=scn.nextInt();
				break;
			case 3:
//				log.info
				System.out.println("enter "+i+"rd element");
				d2[i]=scn.nextInt();
				break;
			default :
//				log.info
				System.out.println("enter "+i+"th element");
				d2[i]=scn.nextInt();
			}
		}
		uniqueInBoth(d1, d2);
		
	}
	public static void uniqueInBoth(int[] d1,int[] d2){
//		Integer s[]={2,3,1,3,2,3,4};
		List<Integer> ds=new ArrayList<>();
		for (int i = 0; i < d1.length; i++) {
			ds.add(d1[i]);
		}for (int i = 0; i < d2.length; i++) {
			ds.add(d2[i]);
		}
		Integer count;
		Map<Integer,Integer> m=new HashMap<>();

		for(int i=0;i<ds.size();i++){
			int c=ds.get(i);
			count=m.get(c);
			if(count==null)
				count=0;
			m.put(c, count+1);
		}
		System.out.println(m);
		Set<Integer> set=m.keySet();
		for(int i:set){
			if(1==m.get(i))
			System.out.println("number those occur by only once are \t"+i );
			
			// \u000d System.out.println("commet that got executed by itself ");
			
		}
	}
}
