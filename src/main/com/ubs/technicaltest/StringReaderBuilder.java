package com.ubs.technicaltest;

/**
 * This class will create different StringReader object  
 * @author YAN
 *
 */
public class StringReaderBuilder {
	
	/**
	 * indicate builder to create StringReaderFromFile
	 */
	public static final int FILESOURCE = 20000;
	/**
	 * indicate builder to create StringReaderFromInput 
	 */
	public static final int INPUTSOURCE = 30000;
	/**
	 * indicate builder to create StringReaderFromKeyboard
	 */
	public static final int KEYBOARDSOURCE = 40000;
	
	private static StringReaderBuilder srb;
	
	/**
	 * get instance of StringReaderBuilder
	 * @return
	 */
	public static StringReaderBuilder getInstance() {
		if(srb==null) {
			srb = new  StringReaderBuilder();
			return srb;
		} else {
			return srb;
		}
	}
	
	/**
	 * create different implementation of StringReader
	 * @param source FILESOURCE, INPUTSOURCE or KEYBOARDSOURCE
	 * @param arg filename with full path, text or null
	 * @return
	 */
	public StringReader buildStringReader(int source, String arg) {
		if(source==FILESOURCE) {
			return new StringReaderFromFile(arg);
		} else if(source==INPUTSOURCE) {
			return new StringReaderFromInput(arg);
		} else if(source==KEYBOARDSOURCE) {
			return new StringReaderFromKeyboard();
		} else return null;
	}
}
