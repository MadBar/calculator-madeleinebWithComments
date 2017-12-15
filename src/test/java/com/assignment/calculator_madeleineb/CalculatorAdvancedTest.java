package com.assignment.calculator_madeleineb;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorAdvancedTest {
	CalculatorAdvanced ca = new CalculatorAdvanced();
	Random r = new Random();
	static final Logger LOG = Logger
			.getLogger(CalculatorAdvanced.class.getName());
	DecimalFormat df = new DecimalFormat("0.00");

	@Test
	public void testPow2Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = nr * nr;
			resultFromMethod = ca.pow2(nr);

			LOG.info(
					"Testing the method pow2 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow2Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = nr * nr;
			resultFromMethod = ca.pow2(nr);

			LOG.info(
					"Testing the method pow2 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow2Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = nr * nr;
		resultFromMethod = ca.pow2(nr);

		LOG.info("Testing the method pow2 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

	@Test
	public void testPow3Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = nr * nr * nr;
			resultFromMethod = ca.pow3(nr);

			LOG.info(
					"Testing the method pow3 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow3Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = nr * nr * nr;
			resultFromMethod = ca.pow3(nr);

			LOG.info(
					"Testing the method pow3 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow3Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = nr * nr * nr;
		resultFromMethod = ca.pow3(nr);

		LOG.info("Testing the method pow3 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

	@Test
	public void testPow4Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = Math.pow(nr, 4);
			resultFromMethod = ca.pow4(nr);

			LOG.info(
					"Testing the method pow4 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow4Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = Math.pow(nr, 4);
			resultFromMethod = ca.pow4(nr);

			LOG.info(
					"Testing the method pow4 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow4Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = Math.pow(nr, 4);
		resultFromMethod = ca.pow4(nr);

		LOG.info("Testing the method pow4 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

	@Test
	public void testPow5Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = Math.pow(nr, 5);
			resultFromMethod = ca.pow5(nr);

			LOG.info(
					"Testing the method pow5 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow5Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = Math.pow(nr, 5);
			resultFromMethod = ca.pow5(nr);

			LOG.info(
					"Testing the method pow5 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow5Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = Math.pow(nr, 5);
		resultFromMethod = ca.pow5(nr);

		LOG.info("Testing the method pow5 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

	@Test
	public void testPow6Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = Math.pow(nr, 6);
			resultFromMethod = ca.pow6(nr);

			LOG.info(
					"Testing the method pow6 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow6Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = Math.pow(nr, 6);
			resultFromMethod = ca.pow6(nr);

			LOG.info(
					"Testing the method pow6 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow6Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = Math.pow(nr, 6);
		resultFromMethod = ca.pow6(nr);

		LOG.info("Testing the method pow6 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

	@Test
	public void testPow7Positive() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = Math.pow(nr, 7);
			resultFromMethod = ca.pow7(nr);

			LOG.info(
					"Testing the method pow7 positive with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow7Negative() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		for (int i = 0; i < 50; i++) {
			nr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = Math.pow(nr, 7);
			resultFromMethod = ca.pow7(nr);

			LOG.info(
					"Testing the method pow7 negative with: "
							+ nr + ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);

		}
	}

	@Test
	public void testPow7Zero() {

		double nr = 0.0;
		double result = 0.0;
		double resultFromMethod = 0.0;

		result = Math.pow(nr, 7);
		resultFromMethod = ca.pow7(nr);

		LOG.info("Testing the method pow7 zero with: " + nr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

//	SEEMES FUNCTIONAL BUT NOT SURE SINCE NEGATIVE DOESN'T WORK
//	@Test
//	public void testPowYPositive() {
//
//		double nrToRaise = 0.0;
//		double powNumber = 0.0;
//		double result = 0.0;
//		double resultFromMethod = 0.0;
//
//		for (int i = 0; i < 50; i++) {
//			nrToRaise = Double.valueOf(
//					df.format(r.nextDouble() * 10));
//			powNumber = Double.valueOf(
//					df.format(r.nextDouble() * 10));
//			result = Math.pow(nrToRaise, powNumber);
//			resultFromMethod = ca.powY(nrToRaise,
//					powNumber);
//
//			LOG.info(
//					"Testing the method powY positive with: "
//							+ nrToRaise + " to raise, and: "
//							+ powNumber
//							+ " to power by. Result from test: "
//							+ result
//							+ ", result from method: "
//							+ resultFromMethod);
//			assertEquals(resultFromMethod, result, 1);
//
//		}
//	}
	
	//NOT FUNCTIONAL YET
//	// Seems to not be able to raise by a negative decimal..?
//	// To Do!!: Test other methods here that could give a negative decimal!
//	@Test
//	public void testPowYNegative() {
//
//		double nrToRaise = 0.0;
//		double powNumber = 0.0;
//		double result = 0.0;
//		double resultFromMethod = 0.0;
//
//		for (int i = 0; i < 50; i++) {
//			nrToRaise = Double.valueOf(
//					df.format(r.nextDouble() * -10));
//
//			// Has to be without decimals when negative powNr.
//			// powNumber = Double.valueOf(
//			// df.format(r.nextDouble() * -10));
//
//			// doesn't work
//			// powNumber = Double.valueOf(
//			// df.format(r.nextInt()-10));
//
//			// Test: double and round to integer..?
//			powNumber =Math.round(Double.valueOf(
//					df.format(r.nextDouble() * -10)));
//
//			result = Math.pow(nrToRaise, powNumber);
//			resultFromMethod = ca.powY(nrToRaise,
//					powNumber);
//
//			LOG.info(
//					"Testing the method powY negative with: "
//							+ nrToRaise + " to raise, and: "
//							+ powNumber
//							+ " to power by. Result from test: "
//							+ result
//							+ ", result from method: "
//							+ resultFromMethod);
//			assertEquals(resultFromMethod, result, 1);
//
//		}
//	}
	
	
//NOT FUNCTIONAL YET
//	@Test
//	public void testPow6Zero() {
//
//		double nr = 0.0;
//		double result = 0.0;
//		double resultFromMethod = 0.0;
//
//		result = Math.pow(nr, 6);
//		resultFromMethod = ca.pow6(nr);
//
//		LOG.info("Testing the method pow6 zero with: " + nr
//				+ ". Result from test: " + result
//				+ ", result from method: "
//				+ resultFromMethod);
//		assertEquals(resultFromMethod, result, 0);
//
//	}
}
