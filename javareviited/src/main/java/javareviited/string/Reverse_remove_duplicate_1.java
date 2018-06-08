package javareviited.string;

public class Reverse_remove_duplicate_1 {

	public static  String reverseMe(String str){
		
		char cArr[] = str.toCharArray();
//		char ca[] = new char[str.length()];
		StringBuilder sb = new StringBuilder();
		for(int i = cArr.length-1;i>=0; i--){
			char c = str.charAt(i);
//			System.out.println(c);
			sb.append(c);
		}
		return sb.toString();
	}
	// delete duplicate 
	public static void delete_duplicate(String str){
		String tmp = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i) ;
//			int c = str.indexOf(ch);
			  if (tmp.indexOf(ch) == -1){
				  tmp+= ch;
			  }
					  
		 
		}System.out.println(tmp);
	}
	public static void main(String ri[]){
		System.out.println(reverseMe("jyoti has nothing to do with luckie" ));
		delete_duplicate("jyoti loves lily");
	}
}
