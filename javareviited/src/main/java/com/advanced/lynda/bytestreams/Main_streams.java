package com.advanced.lynda.bytestreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main_streams {
	
	public static void main(String fj[]){
		
		String fileName  = "G:\\neon_EE\\javareviited\\"
				+ "src\\main\\java\\com\\advanced\\lynda\\bytestreams\\";   // img2.jpeg";
			try(
					Scanner scn = new Scanner(new BufferedReader(new FileReader(fileName+"biffer_1.txt")))
//					FileInputStream fis = new FileInputStream(fileName+"img2.jpeg");
//					FileOutputStream fos  = new FileOutputStream(fileName+"new_img2.jpeg");
					
					){
//				int c;
//				int count =0 ;
//				while((c = fis.read()) != -1){
//					fos.write(c);
//					System.out.println(count + "  stream copied ");
//					count ++;
				
				while(scn.hasNext()){
					System.out.println(scn.next());
					scn.useDelimiter(", ");
				}
			
	}catch(Exception d ){
		System.out.println(d.getMessage());
	 }
	}
}
