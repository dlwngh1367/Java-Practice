/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipFactoryPackage;
import ShipEquipments.HCEngine;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipEquipments.HCGun;

/**

This class implements the ShipFactory interface and provides the implementation for creating
the Halifax Class ship. It creates an instance of HCGun and HCEngine to equip the ship with
the appropriate weapons and engine.
@author Juho Lee
*/
public class HCShipFactory implements ShipFactory{

/**
 * Creates and returns an instance of HCGun.
 *
 * @return an instance of HCGun
 */
@Override
public Weapon addGun() {
            return new HCGun();
}

/**
 * Creates and returns an instance of HCEngine.
 *
 * @return an instance of HCEngine
 */
@Override
public Engine addEngine() {
            return new HCEngine();
}
}