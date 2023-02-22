/* File: FCconverter.java
 * Author: Juho Lee
 * Modified: Juho Lee
 * Date: 01/31/2023
 * Description: Strategy design pattern lab1
 */
package pkgUnitConverter;

/**
 *Interface for mutual method
 * @author Juho Lee
 */
public interface ConversionBehavior {
    
    /**
     *
     * @param input
     * @return
     */
    public double convert(double input);
    
}
