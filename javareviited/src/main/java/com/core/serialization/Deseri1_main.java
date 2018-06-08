package com.core.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deseri1_main {

	public static void main(String rui[]){
		
		Serializtion1 seri1=null;

		try(FileInputStream fis=new FileInputStream("dese1.txt");
				ObjectInputStream ois =new ObjectInputStream(fis);
				){
			seri1=(Serializtion1) ois.readObject();
			
			ois.close();
			fis.close();
		}catch(Exception s){
			s.printStackTrace();
			return;
		}
		System.out.println("first name "+seri1.firstName);
		System.out.println("number ="+seri1.number);
	}
}
