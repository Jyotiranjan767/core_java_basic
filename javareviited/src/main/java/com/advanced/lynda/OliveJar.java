package com.advanced.lynda;

import java.util.ArrayList;

public class OliveJar {

	public static ArrayList<Olive> olives  ;  //=   new ArrayList<>();
//	static
	{
		System.out.println("initialize static oilves ");
		olives =  new ArrayList<>();
		olives.add(new Olive(OliveName.GOLDEN, 0xDA9100)); 
//		olives.add(new Olive("Kalamata", 0x00000));
//		olives.add(new Olive("Picholine", 0x00FF0));
//		olives.add(new Olive("Glde", 0x00000));
	}
	public OliveJar(){
		System.out.println("constructor ,,, ");
	}
	public OliveJar(int nOlives, OliveName oliveName, long color){
		for(int i=1; i<=nOlives; i++){
			olives.add(new Olive(oliveName, color));
		}
	}
	
	public void addOlive(OliveName oliveName, long color){
		olives.add(new Olive(oliveName, color));
	}
	public void reportOlives(){
//		class JarLid{   /// local inner class, this part of this code only has to be called once and only for
//											// the once from within this method and so therefore I don't want to give 
//												// this class a name and then anonymous class is derived
//			public void open(){
//				System.out.println("Twist ,,,,,,,.");
//				System.out.println("pop ,,,,,,,,,,,");
//				}
//			}
//		new JarLid().open(); 
		new Object(){
			public void open(){
				System.out.println("Twist ,,,,,,,.");
				System.out.println("pop ,,,,,,,,,,,");
				}
		}.open();
		for(Olive o: olives){
			System.out.println("It's a "+o.oliveName+" olive and it's color "+o.color);
		}
	}
	
	class Olive {   // member class 

		public static final long BLACK = 0x000000; 
		public OliveName oliveName ;
		public long color  =BLACK;
		
		public Olive(){
			
		}
		public Olive(OliveName oliveName){
			this.oliveName = oliveName;
		}
		public Olive(OliveName oliveName, long color){
			this(oliveName);
			this.color = color;
		}
		public String toString(){
			return "name: "+this.oliveName + "  :  "+" color : "+ this.color;
		}
	}
	
}
