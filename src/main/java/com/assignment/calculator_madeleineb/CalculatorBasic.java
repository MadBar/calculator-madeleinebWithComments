package com.assignment.calculator_madeleineb;

/**
 * This is a sub class called CalculatorBasic that implements
 * CalculatorBasicOperationsInterface. It has 4 methods (basic mathematics
 * operations).
 * 
 * @version 1.0
 * @author Madeleine Barwen
 */
public class CalculatorBasic
		implements CalculatorBasicOperationsInterface {

	// double test = (Double) null;
	// double test2 = 0;

	/**
	 * Method that adds two input numbers and returns result
	 * @param firstNr
	 * @param secondNr
	 * @return
	 */
	public double add(double firstNr, double secondNr) {

		// double result = firstNr + secondNr;
		// return result;
		// System.out.println(test + test2);
		return firstNr + secondNr;

	}

	/**
	 * Method that subtracts two input numbers and returns result
	 * @param firstNr
	 * @param secondNr
	 * @return
	 */
	public double subtract(double firstNr,
			double secondNr) {
		return firstNr - secondNr;
	}

	/**
	 * Method that multiplies two input numbers and returns result
	 * @param firstNr
	 * @param secondNr
	 * @return
	 */
	public double multiply(double firstNr,
			double secondNr) {
		return firstNr * secondNr;
	}

	/**
	 * Method that divides two input numbers and returns result
	 * @param firstNr
	 * @param secondNr
	 * @return
	 */
	public double divide(double firstNr, double secondNr) {
		double roundMethodRes = 0;
		double result = firstNr / secondNr;

		// Test for next line:
		if (Double.isInfinite(result)) {
			// if (Double.isInfinite(result)) {

			System.out.println("Can't devide by 0");
			// result = -100;
			return -0.123456789;
		}
		if (Double.isNaN(result)) {
			// if (Double.isInfinite(result)) {

			System.out.println("Can't devide two 0's");
			// result = -100;
			return -0.123456789;
		}

		return roundMethodRes = Math.round(result * 100.00)
				/ 100.00;

		// roundMethodRes = Math.round(result*100.00)/100.00;
		// return roundMethodRes;

	}

}
