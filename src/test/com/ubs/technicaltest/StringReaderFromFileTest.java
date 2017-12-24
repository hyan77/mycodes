package com.ubs.technicaltest;

import org.junit.Assert;
import org.junit.Test;


public class StringReaderFromFileTest {

	@Test
	public void testReadText() {
		StringReader sb = StringReaderBuilder.getInstance().buildStringReader(StringReaderBuilder.FILESOURCE, "text.txt");
		String str = sb.readText();
		Assert.assertEquals("Hello world", str);
	}
}
