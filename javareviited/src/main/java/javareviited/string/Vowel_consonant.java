package javareviited.string;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String rit[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string to count v and c"); 
		String count=scn.nextLine();
		int v=0,c=0;
		for(int i=0;i<count.length();i++){
			System.out.println(count.charAt(i));
			if((count.charAt(i)== 'a' ) || (count.charAt(i)==  'e') || (count.charAt(i)== 'i' )
			|| (count.charAt(i)== 'o') || (count.charAt(i)==  'u' )){
				v++;
			}else c++;
		}System.out.println(c + " \t "+v);
	}
}
