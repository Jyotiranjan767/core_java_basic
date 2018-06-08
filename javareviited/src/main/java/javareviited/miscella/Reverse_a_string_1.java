package javareviited.miscella;

public class Reverse_a_string_1 {
	
		public static void main(String riu[]){
			String name = "lyndda";
			char[] cArr = name.toCharArray();
			char[] newArr = new char[cArr.length];
			int len = cArr.length-1;
			
			for (int i = 0; i < newArr.length; i++) {
					
					newArr[i]  = cArr[len];
					len--;
				
			}System.out.println(newArr);
		}
}
