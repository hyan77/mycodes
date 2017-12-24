package com.ubs.technicaltest;

/**
 * abstract lexer allow to analyse the occurence of the word 
 * @author YAN
 *
 */
public abstract class Analyzer {
	
	/**
	 * StringReader instance
	 */
	protected StringReader sreader;
	
	/**
	 * Counter instance
	 */
	protected Counter counter;
	
	protected Analyzer(StringReader sreader, Counter counter) {
		this.sreader = sreader;
		this.counter = counter;
	}
	
	public abstract void analyzeWordOccur();
	
}
