package com.ubs.technicaltest;

import org.junit.Assert;
import org.junit.Test;

public class WordCounterTest {

	@Test
	public void testAddStringInCounter() {
		WordCounter wc = new WordCounter();
		wc.addStringInCounter("hello");
		wc.addStringInCounter("hello");
		wc.addStringInCounter("world");
		Assert.assertEquals(wc.getHmWordCounter().get("hello"), new Integer(2));
		Assert.assertEquals(wc.getHmWordCounter().get("world"), new Integer(1));
	}

}
