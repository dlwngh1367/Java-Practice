import java.util.Scanner;
public class Main_Cabbage {

	public static void main(String[] args) {			
		 Scanner keyboard = new Scanner(System.in);
		 Cabbage cabbage = new Cabbage();
		 
		 System.out.print("Enter the cabbage weight:");
		 double weight = keyboard.nextDouble();
		 keyboard.nextLine();
		 
		 System.out.print("Enter the cabbage cost per kilogram:");
		 
		 double costPerKilogram = keyboard.nextDouble();
		 keyboard.nextLine();
		 
		 cabbage.setWeight(weight);
		 System.out.println("cabbage.getWeight()is: " + cabbage.getWeight());
		 
		 cabbage.setKilogram(costPerKilogram);
		 System.out.println("cabbage.getCostPerKilogram()is: "+cabbage.getKilogram());
		
		 System.out.println("cabbage.calculatePrice()is: "+cabbage.calculatePrice(weight,costPerKilogram));
		 cabbage.printReport(weight, costPerKilogram);
		 
		 System.out.println("Testing overloaded constructor with anotherCabbage");
		 
		 Cabbage newCabbage = new Cabbage(3.5,2.5,0.0);
		 System.out.println("weight "+newCabbage.getWeight()+", cost per kilogram"+newCabbage.getKilogram());
		 
	}

}
