package com.ubs.technicaltest;

/**
 * class implement Analyzer interface Analyzer, this class will make the analyse lexicale  
 * @author YAN
 *
 */
public class StringAnalyzer extends Analyzer {	

	public StringAnalyzer(StringReader sreader, Counter counter) {
		super(sreader, counter);
	}
	
	@Override
	public void analyzeWordOccur() {
		// TODO Auto-generated method stub
		String text = sreader.readText();
		
		StringBuffer sb = new StringBuffer("");
		boolean changeWord = true;
		for(int i=0;i<text.length();i++) {
			int c = (int)text.charAt(i);
			if(c>=65&&c<=90||c>=97&&c<=122) {
				if(changeWord==true) {
					changeWord=false;
				}
				sb.append((char)c);
			} else {
				if(changeWord==false) {
					changeWord=true;
					counter.addStringInCounter(sb.toString());
					sb = new StringBuffer("");
				}
			}
		}
		if(sb.toString().trim().length()!=0) {
			counter.addStringInCounter(sb.toString());
		}
	}
}
