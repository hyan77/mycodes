package com.ubs.technicaltest;

import org.junit.Assert;
import org.junit.Test;

public class StringAnalyzerTest {

	@Test
	public void testAnalyseWordOccur() {
		StringReader sb = StringReaderBuilder.getInstance().buildStringReader(StringReaderBuilder.INPUTSOURCE, "hello hello world");
		WordCounter wc = new WordCounter();
		StringAnalyzer sa = new StringAnalyzer(sb, wc);
		sa.analyzeWordOccur();
		Assert.assertEquals(new Integer(2), wc.getHmWordCounter().get("hello"));
		Assert.assertEquals(new Integer(1), wc.getHmWordCounter().get("world"));
	}

}
