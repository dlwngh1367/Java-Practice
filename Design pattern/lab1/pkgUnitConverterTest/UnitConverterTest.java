/* File: UnitConverter.java
 * Author: Juho Lee
 * Modified: Juho Lee
 * Date: 01/31/2023
 * Description: Strategy design pattern lab1
 */
package pkgUnitConverterTest;

import pkgUnitConverter.*;
/**
 *Main class
 * @author Juho Lee
 */
public class UnitConverterTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		
                UnitConverter uc = new UnitConverter();
                uc.setConverter(20.0);
                System.out.printf("%5.2f in Celsius is %5.2f Fahrenheir\n", 20.0, uc.getConvert());
                
                uc.changeBehaviourTo(new FCconverter());
                uc.setConverter(70.0);
                System.out.printf("%5.2f in Fahrenheit is %5.2f Celsius\n", 70.0, uc.getConvert());
                
                uc.changeBehaviourTo(new CIconverter());
                uc.setConverter(2.0);
                System.out.printf("%5.2f in Centimeter is %5.2f Inch\n", 2.0,uc.getConvert());
                
                uc.changeBehaviourTo(new ICconverter());
                uc.setConverter(10.00);
                System.out.printf("%5.2f in Inch in %5.2f Centimeter\n",10.00, uc.getConvert());             
                
                }

}
