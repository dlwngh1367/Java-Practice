
import java.util.Scanner; // Scanner
public class Main_RightAngleTriangle {

	public static void main(String[] args) {
		 Scanner keyboard = new Scanner(System.in); //create a scanner object
		 RightAngleTriangle r1 = new RightAngleTriangle(); //Instantiate r1 object
		 
		 System.out.println("Right angle triangle program");//Prompt the user for inputs
		 System.out.print("Enter adjacent length: ");//2.0
		 double adjacent = keyboard.nextDouble();
		 keyboard.nextLine();
		 r1.setAdjacent(adjacent); //Using set method
		 
		 System.out.print("Enter opposite length: ");//3.0
		 double opposite = keyboard.nextDouble();
		 keyboard.nextLine();
		 r1.setOpposite(opposite); //Using set method
		 
		//All of the outputs have to be formatted to 4 decimal places(using String.format)
		 System.out.println(r1.createReport()); //print out the report
		 System.out.println(String.format("Hypotenuse %.4f", r1.calculateHypotenuse())); 
		 System.out.println(String.format("Perimeter %.4f", r1.calculatePerimeter()));
		 System.out.println(String.format("Area %.4f", r1.calculateArea()));

		 System.out.println("program by Juho Lee");

	}
}