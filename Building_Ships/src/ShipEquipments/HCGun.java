/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipEquipments;

/**

The HCGun class represents a type of weapon used in the Halifax-class ships. It implements the Weapon interface
and overrides its toString() method to return the specific type of gun used in the Halifax-class ships, which is
a 57mm/70 caliber gun from Bofors.
@author Juho Lee
*/
public class HCGun implements Weapon{
    @Override
    public String toString() {
        return "57mm/70 caliber gun from Bofors";
    } 
   
    
}
