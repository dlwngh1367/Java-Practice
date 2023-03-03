/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;
/**

The {@code CSCEngine} class represents the engine of a Canadian Surface Combatant (CSC) ship.

It implements the {@code Engine} interface and provides information about the expected maximum speed of the engine.

@author Juho Lee

@see Engine
*/
public class CSCEngine implements Engine {

/**

Returns a string representation of the expected maximum speed of the CSC ship's engine.
The speed is given in knots and kilometers per hour.
@return a string representation of the expected maximum speed of the CSC ship's engine
*/
    @Override
    public String toString() {
        return "Expected Maximum speed of 27 Knots (50 Km/hour)";
}
}
