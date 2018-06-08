package javareviited.string;

import java.util.Scanner;
import java.util.logging.Logger; 

public class Delete_word_from_string {
	
  private static final Logger logger=Logger.getLogger(Delete_word_from_string.class.getName());
	public static void main(String saiu[]){
		Scanner scn=new Scanner(System.in);
		
		logger.info("write your string to cut,,,");
		String str=scn.nextLine();
		logger.info("return string after cut :"+ deleteByLooping(str,'e'));
		logger.info("return string after cut :"+ removeRecursive(str,'e'));
	}
	public static String deleteByLooping(String string,char unWanted){
		StringBuilder sb=new StringBuilder();
		for(char c:string.toCharArray()){
			if(c!=unWanted){
				sb.append(c);
			}
		}return sb.toString();
	}
	
	public static String removeRecursive(String word,char ch){
		int index=word.indexOf(ch);
		if(index==-1){
			return word;
		}return removeRecursive(word.substring(0, index)+word.substring(index+1,index),ch);
	}
}
