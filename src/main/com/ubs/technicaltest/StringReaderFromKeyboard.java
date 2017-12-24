package com.ubs.technicaltest;

import java.io.Console;
import java.util.Scanner;

/**
 * StringReaderFromKeyboard class will reader text from keyboard
 * @author YAN
 *
 */
public class StringReaderFromKeyboard implements StringReader {
	
	private String str;
	
	// 
	public StringReaderFromKeyboard() {
	}
	
	@Override
	public String readText() {
		System.out.print("Enter your text : ");
		Scanner console = new Scanner(System.in);
		str = console.nextLine();
        return str;
	}
}
