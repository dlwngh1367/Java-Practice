/* File: CFconverter.java
 * Author: Juho Lee
 * Modified: Juho Lee
 * Date: 01/31/2023
 * Description: Strategy design pattern lab1
 */
package pkgUnitConverter;
/**
 * class to convert Celsius value to Fahrenheit
 * @author Juho Lee
 */
public class CFconverter implements ConversionBehavior{
	private final double convFactor=1.8;
	private final double convOrigin=32.0;
	/**
	 * @param input value in Celsius
	 * @return in Fahrenheit
	 */
        @Override
	public double convert(double input) {
		return input*convFactor + convOrigin;
	}
}
