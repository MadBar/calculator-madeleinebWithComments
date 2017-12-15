package com.assignment.calculator_madeleineb;

/**
 * This is a sub class called CalculatorAdvanced that implements
 * CalculatorAdvancedOperationsInterface. It has 6 methods (mathematics
 * operations). 
 * 
 * @version 1.0
 * @author Madeleine Barwen
 */
public class CalculatorAdvanced
		implements CalculatorAdvancedOperationsInterface {

	/**
	 * Power up method that takes a number and returns that number to the power of 2
	 * @param number
	 * @return
	 */
	public double pow2(double number) {

		return Math.round((number * number) * 100) / 100.00;
	}

	/**
	 * Power up method that takes a number and returns that number to the power of 3
	 * @param number
	 * @return
	 */
	public double pow3(double number) {

		return Math.round((Math.pow(number, 3)) * 100)
				/ 100.00;
		// return Math.pow(number, 3);
	}

	/**
	 * Power up method that takes a number and returns that number to the power of 4
	 * @param number
	 * @return
	 */
	public double pow4(double number) {
		return Math.round((Math.pow(number, 4)) * 100)
				/ 100.00;

	}

	/**
	 * Power up method that takes a number and returns that number to the power of 5
	 * @param number
	 * @return
	 */
	public double pow5(double number) {
		return Math.round((Math.pow(number, 5)) * 100)
				/ 100.00;

	}

	/**
	 * Power up method that takes a number and returns that number to the power of 6
	 * @param number
	 * @return
	 */
	public double pow6(double number) {
		return Math.round((Math.pow(number, 6)) * 100)
				/ 100.00;

	}

	/**
	 * Power up method that takes a number and returns that number to the power of 7
	 * @param number
	 * @return
	 */
	public double pow7(double number) {
		return Math.round((Math.pow(number, 7)) * 100)
				/ 100.00;

	}

	// Not functional yet
	// public double powY(double numberToRaise,
	// double powNumber) {
	// return Math.round((Math.pow(numberToRaise, powNumber))*100)/100.00;
	//
	//// return Math.pow(numberToRaise, powNumber);
	// }

}
