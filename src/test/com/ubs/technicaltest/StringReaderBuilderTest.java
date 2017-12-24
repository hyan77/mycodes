package com.ubs.technicaltest;

import org.junit.Assert;
import org.junit.Test;

public class StringReaderBuilderTest {

	@Test
	public void testBuildStringReader() {
		StringReaderBuilder sb = StringReaderBuilder.getInstance();
		Assert.assertTrue((sb.buildStringReader(StringReaderBuilder.FILESOURCE, "text.txt") instanceof StringReaderFromFile));
		
		Assert.assertTrue((sb.buildStringReader(StringReaderBuilder.INPUTSOURCE, "Hello world") instanceof StringReaderFromInput));
		
		Assert.assertTrue((sb.buildStringReader(StringReaderBuilder.KEYBOARDSOURCE, null) instanceof StringReaderFromKeyboard));
	}

}
