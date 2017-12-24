package com.ubs.technicaltest;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class WordCounter implements Counter {
	
	private LinkedHashMap<String, Integer> hmWordCounter = new LinkedHashMap<>();

	@Override
	public void addStringInCounter(String str) {
		// TODO Auto-generated method stub
		Integer nbOccur = hmWordCounter.get(str.toLowerCase());
		if(nbOccur==null) {
			hmWordCounter.put(str.toLowerCase(), new Integer(1));
		} else {
			hmWordCounter.put(str.toLowerCase(), new Integer(nbOccur.intValue()+1));
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Iterator <String>ite = hmWordCounter.keySet().iterator();
		while(ite.hasNext()) {
			String word = ite.next();
			Integer nbOccur = hmWordCounter.get(word);
			System.out.println(word+"  "+nbOccur.intValue());
		}
	}

	public LinkedHashMap<String, Integer> getHmWordCounter() {
		return hmWordCounter;
	}
}
