package edu.utfpr.maffetone.test;

import org.junit.Assert;
import org.junit.Test;

import edu.utfpr.maffetone.Maffetone;

public class MaffetoneTest {

	//TESTES PARA CASO NORMAL
	@Test
	public void testCalcZonaMaffetoneMin() {
		
		Assert.assertEquals(140, Maffetone.calcZonaMaffetone(30).getMin());
	}

	@Test
	public void testCalcZonaMaffetoneMax() {
		
		Assert.assertEquals(150, Maffetone.calcZonaMaffetone(30).getMax());
	}
	
	//TESTES CASO A
	@Test
	public void testCalcZonaMaffetoneMinA() {
		
		Assert.assertEquals(130, Maffetone.calcZonaMaffetoneA(30).getMin());
	}

	@Test
	public void testCalcZonaMaffetoneMaxA() {
		
		Assert.assertEquals(140, Maffetone.calcZonaMaffetoneA(30).getMax());
	}
	
	//TESTES CASO B
	@Test
	public void testCalcZonaMaffetoneMinB() {
		
		Assert.assertEquals(135, Maffetone.calcZonaMaffetoneB(30).getMin());
	}

	@Test
	public void testCalcZonaMaffetoneMaxB() {
		
		Assert.assertEquals(145, Maffetone.calcZonaMaffetoneB(30).getMax());
	}
}
