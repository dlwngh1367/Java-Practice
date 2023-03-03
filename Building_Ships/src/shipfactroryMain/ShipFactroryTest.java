/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shipfactroryMain;
import ShipPackage.Ship;
import ShipBuildPackage.ShipBuilding;
import ShipBuildPackage.SurfaceShipBuilding;

/**

This is a test class for the ShipFactory system. It creates an instance of the SurfaceShipBuilding class,

which is responsible for creating ships of different types. It then orders a Halifax Class ship and a

Canadian Surface Combatant ship by calling the orderTheShip method of the SurfaceShipBuilding class, passing

the appropriate ship type as an argument. It displays the speed and gun description of each ship by calling the

displyShipSpeed and shipGunDesc methods respectively, and also prints out the string representation of each ship

by calling its toString method.

@author Juho Lee
*/
public class ShipFactroryTest {

/**

This is the main method of the class, which is responsible for creating and testing the ShipFactory system.

It creates an instance of the SurfaceShipBuilding class, which is responsible for creating ships of different

types. It then orders a Halifax Class ship and a Canadian Surface Combatant ship by calling the orderTheShip

method of the SurfaceShipBuilding class, passing the appropriate ship type as an argument. It displays the speed

and gun description of each ship by calling the displyShipSpeed and shipGunDesc methods respectively, and also

prints out the string representation of each ship by calling its toString method.

@param args the command line arguments
*/
public static void main(String[] args) {

        ShipBuilding MakeHCs = new SurfaceShipBuilding();
        Ship theHC = MakeHCs.orderTheShip("HC");
        theHC.displyShipSpeed();
        theHC.shipGunDesc();
        System.out.println(theHC + "\n");
        Ship theCSC = MakeHCs.orderTheShip("CSC");
        theCSC.displyShipSpeed();
        theCSC.shipGunDesc();
        System.out.println(theCSC + "\n");

}

}
