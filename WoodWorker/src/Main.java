import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		TableTop table = new TableTop();
		WoodWorker w1 = new WoodWorker();
		double diameter;
		double Area;
		double tablesPerCan;
		int coats;
		
		System.out.print("Enter diameter (inches): ");
		diameter = keyboard.nextDouble();
		
		System.out.print("Enter coats needed: ");
		coats = keyboard.nextInt();
		
		table.setDiameter(diameter);
		Area = table.calculateArea();
		
		tablesPerCan = w1.calculateTablesPerCan(Area, coats);
		
		System.out.println("Tables per one can: " + tablesPerCan);
		System.out.println("Program by Juho Lee");

	}

}
