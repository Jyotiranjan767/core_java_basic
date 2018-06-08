package com.advanced.lynda.olive;

import java.lang.reflect.Constructor;

import com.advanced.lynda.OliveColor;
import com.advanced.lynda.OliveName;

public class Main_walkInheritance {

	public static void main(String sopdap[]){
		Olive o = new Olive(OliveName.GOLDEN, OliveColor.GREEN);
		System.out.println(o.oliveName);
		
		Class<?> c = o.getClass();
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
		
		
		Constructor<?>[] constructors = c.getConstructors();
		System.out.println("Number of constructors : "+ constructors.length);

		Constructor<?> con = constructors[0];
		
		Object obj = null;
		try{
//			obj = con.newInstance(OliveName.PICHOLINE,0x9320); // shows aruement mismatch 
			obj  = con.newInstance(OliveName.LIGURIO, OliveColor.BROWN);
			System.out.println("object : "+obj);
		}catch(Exception sj){
			System.out.println(sj.getMessage());
		}
		Object ob = 	new Kalamata();
		Class<?> cl = ob.getClass();
		System.out.println(cl.getSimpleName());
		Class<?> sup = cl.getSuperclass();
		System.out.println(sup.getSimpleName());
		Class<?> top = sup.getSuperclass();
		System.out.println(top);
		
		Package p = cl.getPackage();
		System.out.println(p.getName());
	}
}
