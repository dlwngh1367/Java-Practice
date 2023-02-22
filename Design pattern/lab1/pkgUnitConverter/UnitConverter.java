/* File: UnitConverter.java
 * Author: Juho Lee
 * Modified: Juho Lee
 * Date: 01/31/2023
 * Description: Strategy design pattern lab1
 */
package pkgUnitConverter;

/**
 * class for handling all the classes.
 * @author Juho Lee
 */
public class UnitConverter {
    private double value;
    private ConversionBehavior conversionBehavior;
    
    /**
     * no-arg constructor initializes conversionBehavoir type CFconverter object.
     * 
     */
    public UnitConverter(){
        this.conversionBehavior = new CFconverter();
    }
    /**
     * Method to set the converter and stored the result value in value
     * @param input
     */
    public void setConverter(double input){
        this.value=this.conversionBehavior.convert(input);
    }
    
    /**
     *method to get the value
     */
    public double getConvert(){
        return value;
        
    }
    /**
     *
     * @param conversionBehaviour
     */
    public void changeBehaviourTo(ConversionBehavior conversionBehaviour){
        this.conversionBehavior = conversionBehaviour;
    }
    
}   
