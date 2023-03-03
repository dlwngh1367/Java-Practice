/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**

HCEngine represents the engine used in Halifax Class ships. It implements the Engine interface and

overrides its toString() method to return the maximum speed of the engine.

@author Juho Lee
*/
public class HCEngine implements Engine{

/**

Returns the maximum speed of the HCEngine in string format.
@return a string representing the maximum speed of the HCEngine
*/
    @Override
    public String toString() {
        return "Maximum speed of 29 Knots (54 Km/hour)";
}
}