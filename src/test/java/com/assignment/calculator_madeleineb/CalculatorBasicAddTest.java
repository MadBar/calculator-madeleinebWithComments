package com.assignment.calculator_madeleineb;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

public class CalculatorBasicAddTest {
	CalculatorBasic cb = new CalculatorBasic();
	Random r = new Random();
	static final Logger LOG = Logger
			.getLogger(CalculatorBasic.class.getName());
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAddPositive() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = firstRandomNr + secondRandomNr;
			resultFromMethod = Math.round(
					cb.add(firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Add positive with: "
							+ firstRandomNr + " and "
							+ secondRandomNr
							+ ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	@Test
	public void testAddNegative() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = firstRandomNr + secondRandomNr;
			resultFromMethod = Math.round(
					cb.add(firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Add negative with: "
							+ firstRandomNr + " and "
							+ secondRandomNr
							+ ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	@Test
	public void testAddFirstZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = firstRandomNr + secondRandomNr;
			resultFromMethod = Math.round(
					cb.add(firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Add first zero with: "
							+ firstRandomNr + " and "
							+ secondRandomNr
							+ ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	@Test
	public void testAddSecondZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));

			result = firstRandomNr + secondRandomNr;
			resultFromMethod = Math.round(
					cb.add(firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Add second zero with: "
							+ firstRandomNr + " and "
							+ secondRandomNr
							+ ". Result from test: "
							+ result
							+ ", result from method: "
							+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	@Test
	public void testAddBothZeros() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = firstRandomNr + secondRandomNr;
		double resultFromMethod = Math.round(
				cb.add(firstRandomNr, secondRandomNr));

		LOG.info("Testing the method Add both zeros with: "
				+ firstRandomNr + " and " + secondRandomNr
				+ ". Result from test: " + result
				+ ", result from method: "
				+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}
}
