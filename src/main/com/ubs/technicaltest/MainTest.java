package com.ubs.technicaltest;

import java.io.Console;

public class MainTest {

	/**
	 * 3 cases :
	 * 1) no argument, then user should input the text
	 * 2) filename, the file should be a .txt file, and should have full path i.e. c:/path1/test.txt
	 * 3) text, user can give a text in the argument, i.e. java MainTest "Hello world" 
	 * @param args
	 */ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReader sr = null;
		if(args.length>1) {
			System.err.println("Arguments number wrong!");
		}
		if(args.length==0)
			sr = StringReaderBuilder.getInstance().buildStringReader(StringReaderBuilder.KEYBOARDSOURCE, null);
		else if(args[0].endsWith(".txt"))
			sr = StringReaderBuilder.getInstance().buildStringReader(StringReaderBuilder.FILESOURCE, args[0]);
		else 
			sr = StringReaderBuilder.getInstance().buildStringReader(StringReaderBuilder.INPUTSOURCE, args[0]);
		
		// create a counter object
		Counter counter = new WordCounter();
		
		// crate a lexer object
		Analyzer analyzer = new StringAnalyzer(sr, counter);
		
		// analyse all word occurrence 
		analyzer.analyzeWordOccur();
		
		// display the occurrence for each word
		counter.display();
	}
}
