package javareviited.string;

import org.testng.annotations.Test;

public class RemoveDuplicate1 {

	@Test
	public void removeDupli(){
		String str="luckie juoti";
		StringBuilder sb=new StringBuilder(str);
		char c=' ';
		int count =0;
		boolean flag=true;
		for (int i = 0; i < str.length(); i++) {
			  count =0;
			 c = str.charAt(i);
			 for (int j = 0; j < str.length(); j++) {
				char[] cA=str.toCharArray();
				
				if(c==cA[j] && flag){
					count++;
				}
					if(count>1){ 
						sb.deleteCharAt(j);
						System.out.println("#@#@     "+sb.deleteCharAt(j));
					
				}
			}
			 if(count>1){
				System.out.println(c);
				//
				System.out.println(sb.toString());
		 }
		}
	}
}
