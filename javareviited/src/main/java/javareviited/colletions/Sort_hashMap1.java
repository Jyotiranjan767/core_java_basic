package javareviited.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Sort_hashMap1 {

  public static void main(String asd[]){
	  
	  Map<String,String>codeNames=new HashMap<>();
	 codeNames.put("Austria","EUro");
	 codeNames.put("eqe","zEUro");
	 codeNames.put("Sisao","gEUro");
	 codeNames.put("sfuera","eEUro");
	 codeNames.put("grk","cEUro");
	 codeNames.put("Belarus","wEUro");
	
	 System.out.println("Sorted by random,,,,,");
	 Set<Entry<String,String>> entries=codeNames.entrySet();
	 for(Entry<String,String> entr:entries)
	 System.out.println(entr.getKey()+"\t"+entr.getValue());
	
	 System.out.println("sorted by key ,,,,,,,,,, tree ");
	 
	 TreeMap<String,String> sortedByKey=new TreeMap<>(codeNames);
	 Set<Entry<String,String>> mappings=sortedByKey.entrySet();
	 for(Entry entr:mappings)
		 System.out.println(entr.getKey()+"\t"+entr.getValue());
		 
	 System.out.println("Sorted by value ,,,,,,,");
	 Comparator<Map.Entry<String,String>> compara=new Comparator<Map.Entry<String,String>>() {
		@Override
		public int compare(Entry<String, String> o1, Entry<String, String> o2) {
               
			return o1.getValue().compareTo(o2.getValue());
		}
	};
	List<Entry<String,String>> listOfEntries=new ArrayList<>(entries);
	Collections.sort(listOfEntries,compara);
	 for(Entry<String,String> entr:listOfEntries)
		 System.out.println(entr.getKey()+"\t"+entr.getValue());
	 
	 
	 //coping entries from List to map
	 LinkedHashMap<String,String> sortedByValue=new LinkedHashMap<>(listOfEntries.size());
	 for(Entry<String,String> entry: listOfEntries)
		 sortedByValue.put(entry.getKey(), entry.getValue());
	 System.out.println("Hashmap after sorting entries by values ");
	 Set<Entry<String,String>>entrySetSortedByValue=sortedByValue.entrySet();
	 for(Entry<String,String> dEntry:entrySetSortedByValue)
		 System.out.println(dEntry.getKey()+" \t "+dEntry.getValue());
  }
}
	