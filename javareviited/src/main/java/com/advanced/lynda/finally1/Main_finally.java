package com.advanced.lynda.finally1;

import java.io.IOException;

import com.advanced.lynda.finally1.exceptions.WrongFileExceptions;

public class Main_finally {

	public static void main(String di[]) throws IOException{
		String fileName_1 = "G:\\neon_EE\\javareviited\\src\\"
				+ "main\\java\\com\\advanced\\lynda\\finally1/finally_1.txt";
		
		String fileName_2 = "G:\\neon_EE\\javareviited\\src\\"
				+ "main\\java\\com\\advanced\\lynda\\finally1/finally_2.txt";
		
		String fileContents = MyFileReader.readFile(fileName_2);
		System.out.println(fileContents);
		
		try {
			if(fileContents.equals("Abigail Mac")){
				System.out.println("You chose the right file.");
			}else  throw (new WrongFileExceptions());
		}catch (WrongFileExceptions e) {
				System.out.println(e.getMessage());
			}
		}
//		MyFileReader.readFile();
}
