package com.advanced.lynda.main;

import com.advanced.lynda.OliveJar;
import com.advanced.lynda.OliveName;

public class StaticMain_1 {

	public static void main(String adiu[]){
		 System.out.println("it is running from main class ");
//		ArrayList<Olive> olives = new OliveJar(3, "Kalamata", 0x00983).olives;
		 OliveJar jar = new OliveJar();
		 jar.addOlive(OliveName.KALAMATA, 0x7842348);
		 jar.addOlive(OliveName.LIGURIO, 0x7842348);
		 jar.addOlive(OliveName.PICHOLINE, 0x7842348);
		 jar.addOlive(OliveName.GOLDEN, 0x7842348);
		 jar.reportOlives();
//		for(Olive o : olives)
//			System.out.println("it's a Olive of "+o.oliveName +" and of color of "+o.color);
	}
	
}
