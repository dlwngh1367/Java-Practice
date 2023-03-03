/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipBuildPackage;
import ShipPackage.Ship;

/**

The abstract class ShipBuilding represents the abstract factory pattern for creating Canadian ships.
This class contains an abstract method makeCanadianShip() which is responsible for creating Canadian ships.
The orderTheShip() method is used to order a ship of a specific type, and calls the makeCanadianShip() method to create it.
It then equips the ship with necessary equipment and returns the created ship.
This class is used to create different types of Canadian ships by implementing the makeCanadianShip() method in a concrete subclass.
@author Juho Lee
@version 1.0
@since 2023-03-02
*/
public abstract class ShipBuilding {	
 
/**
 * Abstract method to create a Canadian ship of a specific type.
 * 
 * @param typeOfShip the type of ship to create
 * @return the created Canadian ship object
 */
protected abstract Ship makeCanadianShip(String typeOfShip);

/**
 * Orders a ship of a specific type, creates it using makeCanadianShip(), and equips the ship with necessary equipment.
 * 
 * @param typeOfShip the type of ship to create
 * @return the created and equipped Canadian ship object
 */
public Ship orderTheShip(String typeOfShip) {
    Ship theShip = makeCanadianShip(typeOfShip);
    theShip.equipShip();
    return theShip;
}
}

