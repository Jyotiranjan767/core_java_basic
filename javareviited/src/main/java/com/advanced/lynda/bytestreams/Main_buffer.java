package com.advanced.lynda.bytestreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main_buffer {

	public static void main(String ifrp[]){
		String fileName  = "G:\\neon_EE\\javareviited\\"
				+ "src\\main\\java\\com\\advanced\\lynda\\bytestreams\\";
		try(
				BufferedReader br = new BufferedReader(new FileReader(fileName+"buffer_1.txt"));
				BufferedWriter bw =  new BufferedWriter(new FileWriter(fileName+"copy_from_buffer_1.txt"));
				){
			int c;
			while((c = br.read()) != -1){
				bw.write(c);
				System.out.println("everything is going to be coping.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
