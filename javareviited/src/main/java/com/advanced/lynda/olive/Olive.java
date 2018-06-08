package com.advanced.lynda.olive;

import com.advanced.lynda.OliveColor;
import com.advanced.lynda.OliveName;

public class Olive {

	public OliveName oliveName;
	public OliveColor color;
	
	public Olive(){
		
	}
	public Olive(OliveName oliveName, OliveColor color){
		this.oliveName = oliveName;
		this.color = color;
	}
	public String toString(){
		return "Olive name : "+ this.oliveName.toString()+" and color : "+this.color;
	}
}
