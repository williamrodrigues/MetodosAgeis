package edu.utfpr.friel.test;

import org.junit.Assert;
import org.junit.Test;

import edu.utfpr.friel.ZoneFriel;

public class ZoneFrielTest {

	// runEndurance
	@Test
	public void testRunEnduranceMin() {
		Assert.assertEquals(0, ZoneFriel.runEndurance(170).getMin());
	}

	@Test
	public void testRunEnduranceMax() {
		Assert.assertEquals(144, ZoneFriel.runEndurance(170).getMax());
	}

	// runModerate
	@Test
	public void testRunModerateMin() {
		Assert.assertEquals(144, ZoneFriel.runModerate(170).getMin());
	}

	@Test
	public void testRunModerateMax() {
		Assert.assertEquals(151, ZoneFriel.runModerate(170).getMax());
	}

	// runTempo
	@Test
	public void testRunTempoMin() {
		Assert.assertEquals(153, ZoneFriel.runTempo(170).getMin());
	}

	@Test
	public void testRunTempoMax() {
		Assert.assertEquals(159, ZoneFriel.runTempo(170).getMax());
	}

	// runThreshold
	@Test
	public void testRunThresholdMin() {
		Assert.assertEquals(161, ZoneFriel.runThreshold(170).getMin());
	}

	@Test
	public void testRunThresholdMax() {
		Assert.assertEquals(168, ZoneFriel.runThreshold(170).getMax());
	}

	// runAnaerobic
	@Test
	public void testRunAnaerobicMin() {
		Assert.assertEquals(170, ZoneFriel.runAnaerobic(170).getMin());
	}

	@Test
	public void testRunAnaerobicMax() {
		Assert.assertEquals(173, ZoneFriel.runAnaerobic(170).getMax());
	}

	// runBreathless
	@Test
	public void testRunBreathlessMin() {
		Assert.assertEquals(175, ZoneFriel.runBreathless(170).getMin());
	}

	@Test
	public void testRunBreathlessMax() {
		Assert.assertEquals(180, ZoneFriel.runBreathless(170).getMax());
	}

	// runWithTrouble
	@Test
	public void testRunWithTroubleMin() {
		Assert.assertEquals(181, ZoneFriel.runWithTrouble(170).getMin());
	}
}
