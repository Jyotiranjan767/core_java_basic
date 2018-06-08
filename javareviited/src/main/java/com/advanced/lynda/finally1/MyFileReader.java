package com.advanced.lynda.finally1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static String readFile(String fileName) throws IOException{
		FileReader fr =null;
		BufferedReader br =null;
		StringBuffer sb = new StringBuffer();
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null){
//				System.out.println(s);
				sb.append(s);
			}
			
		} catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
			return e.getMessage();
		}finally{
//			System.out.println("will execute anyway,,,, ");
			if(fr != null)
				fr.close();
			if(br!=null)
				br.close();
//			System.out.println("Still alive,,,,  ");
		}
		return sb.toString();
	}
}
