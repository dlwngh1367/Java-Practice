/* File: FCconverter.java
 * Author: Juho Lee
 * Modified: Juho Lee
 * Date: 01/31/2023
 * Description: Strategy design pattern lab1
 */
package pkgUnitConverter;
/**
 * class to convert Fahrenheit to Celsius
 * @author Juho Lee
 */
public class FCconverter implements ConversionBehavior{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	
	/**
	 * @param input value in Fahrenheit
	 * @return in Celsius
	 */
        @Override
	public double convert(double input) {
		return (input - convOrigin)/convFactor;
	}
}
