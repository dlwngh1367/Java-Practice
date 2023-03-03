/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**

This class represents a gun that can be equipped on a CSC (Canadian Surface Combatant) ship.

The gun is expected to be a 127mm/64 caliber gun from Leonardo.

This class implements the Weapon interface.

@author Juho Lee
*/
public class CSCGun implements Weapon {

/**

Returns a string representation of the expected gun.
@return a string representation of the expected gun
*/
    @Override
    public String toString() {
        return "127mm/64 caliber gun from Leonardo (expected)";
}
}
