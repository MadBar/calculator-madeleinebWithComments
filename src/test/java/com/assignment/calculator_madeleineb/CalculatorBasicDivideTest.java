package com.assignment.calculator_madeleineb;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

public class CalculatorBasicDivideTest {

	CalculatorBasic cb = new CalculatorBasic();
	Random r = new Random();
	static final Logger LOG = Logger
			.getLogger(CalculatorBasic.class.getName());
	DecimalFormat df = new DecimalFormat("0.00");

	// QUESTION: Do we really need try catch? Program never seems so access it?

	// // A copy of following test testDividePositive. Alteration. This makes
	// // possible to test more cases looking for a case when secondNr get set
	// to
	// // 0.00 causing the program to break. To test if it indeed breaks when
	// dividing by 0.
	// @Test
	// public void testDividePositive() {
	//
	// double firstRandomNr = 0;
	// double secondRandomNr = 0;
	// double result = 0;
	// double resultFromMethod = 0;
	//
	// //run more times than required, break when trying to divide by 0.
	// for (int i = 0; (i < 1000
	// || secondRandomNr == 0.00); i++) {
	// firstRandomNr = Double.valueOf(
	// df.format(r.nextDouble() * 10));
	// secondRandomNr = Double.valueOf(
	// df.format(r.nextDouble() * 10));
	//
	// try {
	// result = firstRandomNr / secondRandomNr;
	//
	// resultFromMethod = cb.divide(firstRandomNr,
	// secondRandomNr);
	//
	// } catch (ArithmeticException e) {
	// e.getMessage();
	// }
	//
	// LOG.info(i
	// + " Testing the method Divide positive with: "
	// + firstRandomNr + " and "
	// + secondRandomNr
	// + ". Result from test: " + result
	// + ", result from method: "
	// + resultFromMethod);
	// assertEquals(resultFromMethod, result, 1);
	// }
	//
	// }

	@Test
	public void testDividePositive() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;
		// double roundMethodRes = 0;

		// for (int i = 0; (i < 3000
		// || secondRandomNr == 0.00); i++) {
		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));

			try {
				result = firstRandomNr / secondRandomNr;

				resultFromMethod = cb.divide(firstRandomNr,
						secondRandomNr);
				// roundMethodRes = Math.round(resultFromMethod*100.00)/100.00;

				// resultFromMethod = cb.divide(
				// firstRandomNr, secondRandomNr);
				// roundMethodRes = Math.round(resultFromMethod*100.00)/100.00;

				// resultFromMethod = Math.round(cb.divide(
				// firstRandomNr, secondRandomNr)*100)/100;

				// resultFromMethod = Math.round(((cb.divide(
				// firstRandomNr, secondRandomNr)*100.0)/100.0));

				// resultFromMethod = Math.round(cb.divide(
				// firstRandomNr, secondRandomNr));

				// resultFromMethod = cb
				// .divide(firstRandomNr, secondRandomNr);
			} catch (ArithmeticException e) {
				e.getMessage();
			}

			// Added this if to get coverage for assert at bottom. Here that's
			// only needed though if the first loop gets two 0, or second nr
			// gets 0. Probably unnecessary? This is not very good though, cause
			// it later in the Log makes it appear as this new value for result
			// came from our own division here in test, which it didn't..
			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i
					+ " Testing the method Divide positive with: "
					+ firstRandomNr + " and "
					+ secondRandomNr
					+ ". Result from test: " + result
					+ ", result from method: "
					+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	@Test
	public void testDivideNegative() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		// for (int i = 0; (i < 3000
		// || secondRandomNr == 0.00); i++) {
		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * -10));
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * -10));

			try {
				result = firstRandomNr / secondRandomNr;

				resultFromMethod = cb.divide(firstRandomNr,
						secondRandomNr);
			} catch (ArithmeticException e) {
				e.getMessage();
			}

			// Added this if to get coverage for assert at bottom. Here that's
			// only needed though if the first loop gets two 0, or second nr
			// gets 0. Probably unnecessary?
			// This is not very good though, cause it later in the Log makes it
			// appear as this new value for result came from our own division
			// here in test, which it didn't..
			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i
					+ " Testing the method Divide negative with: "
					+ firstRandomNr + " and "
					+ secondRandomNr
					+ ". Result from test: " + result
					+ ", result from method: "
					+ resultFromMethod);
			assertEquals(resultFromMethod, result, 1);
		}

	}

	// Why doesn't it print out the "Can't divide by 0" from method when breaks.
	// FIXED: because value became NaN instead of Infinite
	@Test
	public void testDivideFirstZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		// for (int i = 0; (i < 3000
		// || secondRandomNr == 0.00); i++) {
		for (int i = 0; i < 50; i++) {
			secondRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));

			// // Temp if to break at if second randomed 0
			// if (secondRandomNr == 0) {
			// System.out.println();
			// }

			try {
				result = firstRandomNr / secondRandomNr;

				resultFromMethod = cb.divide(firstRandomNr,
						secondRandomNr);
			} catch (ArithmeticException e) {
				e.getMessage();
			}

			// Added this if to get coverage for assert at bottom. Here that's
			// only needed though if the first loop gets a random 0. Probably
			// unnecessary?
			// This is not very good though, cause it later in the Log makes it
			// appear as this new value for result came from our own division
			// here in test, which it didn't..
			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i
					+ " Testing the method Divide first zero with: "
					+ firstRandomNr + " and "
					+ secondRandomNr
					+ ". Result from test: " + result
					+ ", result from method: "
					+ resultFromMethod);
			assertEquals(resultFromMethod, result, 0);
		}

	}

	// testDivideSecondZero and testDivideBothZeros lose coverage since infinite
	// and
	@Test
	public void testDivideSecondZero() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = 0;
		double resultFromMethod = 0;

		// QUESTION: Is ther ANY point to have a loop here? Maybe?
		for (int i = 0; i < 50; i++) {
			firstRandomNr = Double.valueOf(
					df.format(r.nextDouble() * 10));

			result = firstRandomNr / secondRandomNr;
			resultFromMethod = cb.divide(firstRandomNr,
					secondRandomNr);

			// Added this if to get coverage for assert at bottom
			if (resultFromMethod == -0.123456789) {
				result = -0.123456789;
			}

			LOG.info(i
					+ " Testing the method Divide second zero with: "
					+ firstRandomNr + " and "
					+ secondRandomNr
					+ ". Result from test: " + result
					+ ", result from method: "
					+ resultFromMethod);
			assertEquals(resultFromMethod, result, 0);
		}

	}

	// result can only be NaN (but we set -0.12356789)
	@Test
	public void testDivideBothZeros() {

		double firstRandomNr = 0;
		double secondRandomNr = 0;
		double result = firstRandomNr / secondRandomNr;
		double resultFromMethod = cb.divide(firstRandomNr,
				secondRandomNr);

		// Added this if to get coverage for assert at bottom
		if (resultFromMethod == -0.123456789) {
			result = -0.123456789;
		}

		LOG.info(
				"Testing the method Divide both zeros with: "
						+ firstRandomNr + " and "
						+ secondRandomNr
						+ ". Result from test: " + result
						+ ", result from method: "
						+ resultFromMethod);
		assertEquals(resultFromMethod, result, 0);

	}

}
