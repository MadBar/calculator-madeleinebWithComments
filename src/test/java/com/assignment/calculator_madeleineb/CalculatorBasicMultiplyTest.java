package com.assignment.calculator_madeleineb;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

public class CalculatorBasicMultiplyTest {

	CalculatorBasic cb = new CalculatorBasic();
	Random r = new Random();
	static final Logger LOG = Logger
			.getLogger(CalculatorBasic.class.getName());
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testMultiplyPositive() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = firstRandomNr * secondRandomNr;
			resultFromMethod = Math.round(cb.multiply(
					firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Multiply positive with: "
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
	public void testMultiplyNegative() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			result = firstRandomNr * secondRandomNr;
			resultFromMethod = Math.round(cb.multiply(
					firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Multiply negative with: "
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
	public void testMultiplyFirstZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			result = firstRandomNr * secondRandomNr;
			resultFromMethod = Math.round(cb.multiply(
					firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Multiply first zero with: "
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
	public void testMultiplySecondZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));

			result = firstRandomNr * secondRandomNr;
			resultFromMethod = Math.round(cb.multiply(
					firstRandomNr, secondRandomNr));

			LOG.info(
					"Testing the method Multiply second zero with: "
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
	public void testMultiplyBothZeros() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = firstRandomNr * secondRandomNr;
		double resultFromMethod = Math.round(
				cb.multiply(firstRandomNr, secondRandomNr));

		LOG.info(
				"Testing the method Multiply both zeros with: "
						+ firstRandomNr + " and "
						+ secondRandomNr
						+ ". Result from test: " + result
						+ ", result from method: "
						+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}
}
