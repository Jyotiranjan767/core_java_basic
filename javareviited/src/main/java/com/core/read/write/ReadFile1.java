package com.core.read.write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFile1 {

	public static void main(String riut[]){
		
		try(BufferedReader br=new BufferedReader(new FileReader("lumberJack.log"));
				BufferedWriter bw=new BufferedWriter(new FileWriter("make1LunmberJack.log"));
				){
			String str="";
			while((str=br.readLine())!=null){
				System.out.println(str);
				bw.write(str);
			}
		}catch(Exception dj){
			dj.printStackTrace();
		}
	}
}
