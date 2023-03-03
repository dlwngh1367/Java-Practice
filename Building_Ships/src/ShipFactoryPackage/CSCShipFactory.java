/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipFactoryPackage;
import ShipEquipments.CSCGun;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipEquipments.CSCEngine;

/**

A concrete factory class that creates a set of weapons and engines for the Canadian Surface Combatant ship.
The weapons and engines are specific to the CSC ship model.
Implements the ShipFactory interface.
@author Juho Lee
*/
public class CSCShipFactory implements ShipFactory{

/**
 * Creates a CSCGun object.
 * @return a new CSCGun object
 */
public Weapon addGun() {
	return new CSCGun(); 
}

/**
 * Creates a CSCEngine object.
 * @return a new CSCEngine object
 */
public Engine addEngine() {
	return new CSCEngine();
}
}

