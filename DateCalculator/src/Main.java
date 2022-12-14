import java.util.*;
import java.time.temporal.ChronoUnit; 
import java.time.LocalDate; 

/**
 * This program outputs remaining weeks till 
 * end of course if student number is even and
 * prints remaining months in 2022 if student number is odd.
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */

public class Main {

	public static void main(String[] args) {
		String name; 
		int number = 2;
		String reason1;
		String reason2;
		
		Scanner scanner = new Scanner(System.in);
		Date date = new Date();
		
		LocalDate date1 = LocalDate.now(); 
		LocalDate date2 = LocalDate.of(2024, 6, 30);
		LocalDate date3 = LocalDate.of(2022, 12, 31);
		
		
		
		System.out.println("Enter your name :");
		name = scanner.nextLine();
		
		System.out.println("Enter Student number :");
		number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the first reason for taking course :");
		reason1 = scanner.nextLine();
		
		System.out.println("Enter the second the reason for taking course :");
		reason2 = scanner.nextLine();
		
		System.out.println("Your name is" + name);
		System.out.println("Your student number is " + number);
		System.out.println("Your first reason is " + reason1);
		System.out.println("Your second reason is " + reason2);
		System.out.println();
		
		if((number % 2 )== 1) {
			long Week = ChronoUnit.WEEKS.between(date1, date2);
			System.out.println(Week - 1 + " Weeks left to graduate");
			
		}else {
			long Month = ChronoUnit.MONTHS.between(date1, date3);
			System.out.println(Month + 1+ " Months left");
		}
		
	}
	}
