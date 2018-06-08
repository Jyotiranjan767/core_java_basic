package com.advanced.lynda;

public enum OliveColor {

	RED("red"),GREEN("green"),VIOLET("violet"), BROWN("brown");
	
	private String nameAsString;
	private OliveColor(String nameAsString){
		this.nameAsString =nameAsString;
	}
	@Override
	public String toString() {
		return this.nameAsString.toString();
	}
}
