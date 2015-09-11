package edu.utfpr.maffetone.test;

import org.junit.Assert;
import org.junit.Test;

import edu.utfpr.maffetone.Maffetone;

public class MaffetoneTest {

	@Test
	public void testCalcZonaMaffetoneMin() {
		
		Assert.assertEquals(140, Maffetone.calcZonaMaffetone(30).getMin());
	}

	@Test
	public void testCalcZonaMaffetoneMax() {
		
		Assert.assertEquals(150, Maffetone.calcZonaMaffetone(30).getMax());
	}
	
}
