/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;

import ShipFactoryPackage.ShipFactory;

/**
 *
 * The HCShip class extends the abstract Ship class and represents a specific type of ship called the Halifax Class ship.
 * This class contains a ShipFactory object to create the ship's engine and weapon using the factory method design pattern.
 * The equipShip method is responsible for equipping the ship with the appropriate engine and weapon.
 *
 * @author Juho Lee
 */
public class HCShip extends Ship{
	
	
	ShipFactory shipFactory;
	
	public HCShip(ShipFactory shipFactory){
                this.shipFactory = shipFactory;
	}
	
	public void equipShip() {
	
		System.out.println("Adding equipments to Halifax Class ship " + getName());
                this.engine = shipFactory.addEngine();
                this.weapon = shipFactory.addGun();
	}	
}