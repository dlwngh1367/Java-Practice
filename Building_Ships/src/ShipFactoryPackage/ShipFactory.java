package ShipFactoryPackage;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * An interface that defines methods to create different components for a ship.
 * A concrete implementation of this interface will define methods to create
 * specific types of weapons and engines for a ship.
 * @author Juho Lee
 */


public interface ShipFactory{
	
	public Weapon addGun();
	public Engine addEngine();
	
}

