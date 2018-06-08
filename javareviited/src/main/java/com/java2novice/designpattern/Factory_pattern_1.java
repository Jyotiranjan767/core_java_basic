package com.java2novice.designpattern;

 interface Currency{
	String getCurrency();
	String getSymbol();
}
class India implements Currency{
	 
	 public String getCurrency(){
		return "rupees" ; 
	 }
	 public String getSymbol(){
		 return "Rs";
	 }
 }
class USA implements Currency{
	 public String getCurrency(){
		 return "Dollar";
	 }
	 public String getSymbol(){
		 return "$";
	 }
 }
class CustomNullPointerException extends NullPointerException{

	private static final long serialVersionUID = 1L;
	 
	 public CustomNullPointerException() {
		 System.out.println("Currency interface points to a null ");
	}
 }
public class Factory_pattern_1 {
	
	India  in;
	USA usa;
	
//	public Factory_pattern_1(India in, USA usa) {
//			this.in = in;
//			this.usa =usa ;
//	}
	public void chooseCountry(Currency s){
		if(s instanceof India){
			in = new India();
			System.out.println(in.getCurrency());
			System.out.println(in.getSymbol());
		}else if(s instanceof USA){
			usa = new USA();
			System.out.println(usa.getCurrency());
			System.out.println(usa.getSymbol());
		}else{
			throw new CustomNullPointerException();
		}
	}
	public static void main(String iuf[]){
		Currency c = null;
		Factory_pattern_1 fp1 = new Factory_pattern_1();
		fp1.chooseCountry(c);
	}
}