package com.assignment.calculator_madeleineb;

/**
 * This is an Interface called CalculatorBasicOperationsInterface. It has 4
 * methods (basic mathematic operations). The sub class CalculatorBasic
 * implements this Interface.
 * 
 * @version 1.0
 * @author Madeleine Barwen
 */
public interface CalculatorBasicOperationsInterface {

	/**
	 * @param  firstNr - the first number of the operation
	 * @param  secondNr - the second number of the operations
	 * @return
	 */
	double add(double firstNr, double secondNr);

	/**
	 * @param firstNr
	 * @param secondNr
	 * @return
	 */
	double subtract(double firstNr, double secondNr);

	/**
	 * @param firstNr
	 * @param secondNr
	 * @return
	 */
	double multiply(double firstNr, double secondNr);

	/**
	 * @param firstNr
	 * @param secondNr
	 * @return
	 */
	double divide(double firstNr, double secondNr);

}
