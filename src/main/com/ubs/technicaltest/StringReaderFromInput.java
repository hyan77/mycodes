package com.ubs.technicaltest;

/**
 * StringReaderFromInput class will reader text from input argument
 * @author YAN
 *
 */
public class StringReaderFromInput implements StringReader {

	private String str;
	
	public StringReaderFromInput(String str) {
		this.str = str;
	}
	
	@Override
	public String readText() {
		// TODO Auto-generated method stub
		return str;
	}
}
