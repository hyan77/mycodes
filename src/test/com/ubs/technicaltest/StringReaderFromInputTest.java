package com.ubs.technicaltest;

import org.junit.Assert;
import org.junit.Test;

public class StringReaderFromInputTest {

	@Test
	public void testReadText() {
		StringReader sb = StringReaderBuilder.getInstance().buildStringReader(StringReaderBuilder.INPUTSOURCE, "Hello world");
		String str = sb.readText();
		Assert.assertEquals("Hello world", str);
	}

}
