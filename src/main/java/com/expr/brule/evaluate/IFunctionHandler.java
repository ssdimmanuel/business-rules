package com.expr.brule.evaluate;

/**
 * Function handler interface
 * @author ssdImmanuel
 *
 */
public interface IFunctionHandler {
	/**
	 * execute a function
	 * @return
	 */
	public boolean execute();
	
	/**
	 * Validate the arguments passed in the rule
	 * @param args
	 * @return
	 */
	public boolean isValidationSuccess(String... args);
}
