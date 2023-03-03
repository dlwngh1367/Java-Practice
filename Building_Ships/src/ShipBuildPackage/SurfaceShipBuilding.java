/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipBuildPackage;
import ShipFactoryPackage.CSCShipFactory;
import ShipFactoryPackage.HCShipFactory;
import ShipPackage.Ship;
import ShipPackage.HCShip;
import ShipPackage.CSCShip;
import ShipFactoryPackage.ShipFactory;

/**

The SurfaceShipBuilding class is a concrete implementation of the abstract class ShipBuilding,
responsible for building surface ships in Canada. This class overrides the makeCanadianShip method
to create specific types of Canadian surface ships based on the input parameter, typeOfShip.
@author Juho Lee
*/

/**
 * Creates a specific type of Canadian surface ship based on the input parameter, typeOfShip.
 * 
 * @param typeOfShip a String representing the type of Canadian surface ship to create
 * @return a Ship object representing the created Canadian surface ship
 */
public class SurfaceShipBuilding extends ShipBuilding {
        @Override
	protected Ship makeCanadianShip(String typeOfShip) {
		Ship theCanadianShip = null;
		if(typeOfShip.equals("HC")){
			ShipFactory shipPartsFactory = new HCShipFactory();
			theCanadianShip = new HCShip(shipPartsFactory);
			theCanadianShip.setName("HMCS Ottawa");
                        System.out.println("Created Halifax Class ship " + theCanadianShip.getName());
                        
		} else 
			
		if(typeOfShip.equals("CSC")){
			ShipFactory shipPartsFactory = new CSCShipFactory();
			theCanadianShip = new CSCShip(shipPartsFactory);
			theCanadianShip.setName("HMCS CSC001");
                        System.out.println("Created Canadian Surface Combatant ship " + theCanadianShip.getName());
			
		} 	
	return theCanadianShip;
	}
}

