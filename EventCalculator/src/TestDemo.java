import java.util.Scanner;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Juho Lee
 */
public class TestDemo {
	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	
	public static void main(String[] args) {

	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Just creating 4 EventSchedules");
	System.out.println();
	System.out.println("EventSchedule1");
	
	EventSchedule schedule1 = new EventSchedule();
	System.out.println(schedule1.createReport());
	System.out.println("EventSchedule2");
	
	EventSchedule schedule2 = new EventSchedule(scanner.nextInt());
	System.out.println(schedule2.createReport());
	int y3 = scanner.nextInt();
	int m3 = scanner.nextInt();
	System.out.println("EventSchedule3");
	
	EventSchedule schedule3 = new EventSchedule(y3,m3);
	System.out.println(schedule3.createReport());
	int y4 = scanner.nextInt();
	int m4 = scanner.nextInt();
	int d4 = scanner.nextInt();
	System.out.println("EventSchedule4");
	
	EventSchedule schedule4 = new EventSchedule(y4, m4, d4);
	System.out.println(schedule4.createReport());

	}

}
