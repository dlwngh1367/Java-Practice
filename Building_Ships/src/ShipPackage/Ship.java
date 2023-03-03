/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;

/**
 *
 *The abstract class Ship represents a generic ship with a name, a weapon, and an engine.
 *The class defines abstract method equipShip() to equip the ship with the specific weapon and engine.
 *The class provides two methods to display the speed of the ship's engine and the description of the ship's weapon.
 *The class overrides the toString() method to return a string representation of the ship's information.
 *@author Juho Lee
 */

public abstract class Ship {
	
	private String name;
	
	Weapon weapon;
	Engine engine;
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
        
        
	
	public abstract void equipShip();
	
	
	public void displyShipSpeed(){
		
		System.out.println(getName() + " Engine: " + engine );
		
	}
	
	public void shipGunDesc(){
		
		System.out.println(getName() + " Gun: " + weapon);
		
	}
	
	
	public String toString(){
		
		String infoOnShip = "The " + name + " with " + engine + 
				" and has  " + weapon;
		
		return infoOnShip;
		
	}
	
}

