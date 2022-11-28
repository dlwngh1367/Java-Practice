import static org.junit.Assert.*;
/**
 * This is a programme that analyses the patient's data,
 * Draws conclusions, and shows the results to the user. 
 * This system stores vital health information about a patient.
 * 
 * File name: MyHealthData.java
 * Author: Juho Lee, 041060004
 * Course: CST8284
 * Professor: Justin Martin
 * Assignment: Assignment01
 * Date: Nov. 04, 2022 
  * Purpose: This programme analyses and stores the patient's data,
 *          and then shows the results to the user. 
 *          This health system stores health information about a patient virtually.
 * 
 * @author Juho Lee
 * @version 11.0.16
 * @since 1.8.0_342
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyHealthDataTest2 {

	private static final double EPSILON = 1E-01;
	
	/**
	 * testing the BMI
	 */
	@Test
	public void testGetBMI1() {
		MyHealthData healthData = new MyHealthData("Juho", "Lee", "Male", 1999, 2022, 173.02, 60.11);
		double result = healthData.getBMI();
		double expected = 1.411593;
	    Assert.assertEquals(expected, result, EPSILON);
		assertTrue(true);
		}
	
	/**
	 * testing the BMI
	 */
	@Test
	public void testGetBMI2() {
		MyHealthData healthData = new MyHealthData("Juho", "Lee", "Male", 1999, 2022, 173.02, 60.11);
		double result = healthData.getBMI();
		double expected = 19;
	    Assert.assertEquals(expected, result, EPSILON);
		assertTrue(true);
		}
}
