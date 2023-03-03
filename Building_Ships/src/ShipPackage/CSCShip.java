/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;
import ShipFactoryPackage.ShipFactory;

/**

This class represents a Canadian Surface Combatant ship that extends the abstract class Ship.

It has a ShipFactory object as an instance variable that determines the type of equipments added to the ship.

The method equipShip() adds the engine and gun to the ship using the ShipFactory object.

@author Juho Lee
*/
public class CSCShip extends Ship{

ShipFactory shipFactory;

/**

Constructor for the CSCShip class that takes a ShipFactory object as an argument.
@param shipFactory the ShipFactory object that determines the type of equipments added to the ship.
*/
public CSCShip(ShipFactory shipFactory){
this.shipFactory = shipFactory;
}
/**

This method adds the engine and gun to the Canadian Surface Combatant ship using the ShipFactory object.
*/
public void equipShip() {
System.out.println("Adding equipments to Canadian Surface Combatant ship " + getName());
this.engine = shipFactory.addEngine();
this.weapon = shipFactory.addGun();
}
}

