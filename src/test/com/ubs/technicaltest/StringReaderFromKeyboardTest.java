package com.ubs.technicaltest;

import org.junit.Assert;
import org.junit.Test;

public class StringReaderFromKeyboardTest {

	@Test
	public void testReadText() {
		StringReader sb = StringReaderBuilder.getInstance().buildStringReader(StringReaderBuilder.KEYBOARDSOURCE, null);
		String str = sb.readText();
		// input "Hello world"
		Assert.assertEquals("Hello world", str);
	}
}
