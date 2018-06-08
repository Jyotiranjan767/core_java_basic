package com.core.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Seri_main1 {

	public static void main(String iru[]){
		Serializtion1 se1=new Serializtion1();
		
		try(FileOutputStream fos=new FileOutputStream("seri1.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos); 
				){
			oos.writeObject(se1);
			oos.close();
			fos.close();
			System.out.println("java serialized,,,,");
		}catch(Exception f){
			f.printStackTrace();
		}
		
	}
}
