/* File: ICconverter.java
 * Author: Juho Lee
 * Modified: Juho Lee
 * Date: 01/31/2023
 * Description: Strategy design pattern lab1
 */
package pkgUnitConverter;

/**
 *class to convert Inch to Centimeter
 * @author Juho Lee
 */
public class ICconverter implements ConversionBehavior{
    private final double convFact = 2.54;
    
    /**
     * @param input value in Centimeter
     * @return in Inch
     */
    @Override
    public double convert(double input){
        return input*convFact;
    }
}
