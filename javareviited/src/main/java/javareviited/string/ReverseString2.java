package javareviited.string;

public class ReverseString2 {

	public static void reverse1(String ir){ 
		StringBuilder sb=new StringBuilder();
		for(int i=ir.length()-1;i>=0;i--){
			sb.append(ir.charAt(i));
		}
		System.out.println(sb.toString());
	}
	
	public static void remove_duplicate(String r){
		char c=' ';
		String tmp=" ";
		for(int i=0;i<r.length();i++){
			c=r.charAt(i);
			if(tmp.indexOf(c)==-1)
				tmp+=c;
		}System.out.println(tmp);
		
	}
	public static void main(String ri[]){
		String ir="Jyoti loves luckie";
		reverse1(ir);
		remove_duplicate(ir);
	}
}
