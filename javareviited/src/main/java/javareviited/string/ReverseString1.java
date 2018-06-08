package javareviited.string;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String sdq[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string to reverse,,'");
		System.out.println(reverse(scn.nextLine()));
		System.out.println("Enter a string to remove duplicate,,'");
		System.out.println(removeDuplicate(scn.nextLine()));
		
	}
	public static String removeDuplicate(String sd){
		char c=' ';
		String repl=" ";
		for(int i=0;i<sd.length();i++){
			c=sd.charAt(i);
			if(repl.indexOf(c)==-1)
				repl+=c;
		}
		return repl;
	}
	public static String reverse(String sd){
		StringBuilder sb=new StringBuilder();
		char c=' ';
		for(int i=sd.length()-1;i>=0;i--){
			c=sd.charAt(i);
			sb.append(c);
			sd=sd+c;
		}return sb.toString()+"\t"+sd;
	}
}
