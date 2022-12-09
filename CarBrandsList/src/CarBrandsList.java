/**
 * This is the program that lists the list of the cars using various methods.
 * 
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CarBrandsList {

public static void main(String[] args) {
/**
 * Array object rides and rides2
 */
   String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai",  "mercedies", "keke"};
   String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};
/**
 * Array lists
 */
   List<String> list = Arrays.asList(rides);
   LinkedList<String> list1 = new LinkedList<String>(list);

   list = Arrays.asList(rides2);
   LinkedList<String> list2 = new LinkedList<String>(list);

   list1.addAll(list2);
   printList(list1);
/**
 * Change all the letters to upper case
 */

System.out.printf("%nCar Brands in uppercase letters: ");
   for (int i = 0; i < list1.size(); i++) {
     list1.add(list1.size(), list1.getFirst().toUpperCase());
     list1.remove();
   }
   printList(list1);
   /**
    * Delete car brands HYUNDAI MERCEDIES KEKE
    */
   System.out.printf("%nDeleting car brands 5 to 7...");
   
   list1.subList(4, 7).clear();
   printList(list1);
   
   System.out.printf("%nReversed List:\n");
   printReverseList(list1);

/**
 * Sort car brands in alphabetical order
 */

   System.out.printf("%nSorted car brands in ascending order");
   list1.sort(null);
   printList(list1);

   System.out.printf("%nRemoved duplicate brands\n");
   printNonDuplicates(list1);
} 
/**
 * 
 * @param list
 *  parameter list to print reverse array
 */
public static void printReverseList(LinkedList<String> list) {
	String output = "";
	for(String reverse: list) {
		output = reverse + " " + output;
	}
	System.out.println(output);
}
/**
 *  
 * @param list 
 *  parameter list to print list of cars
 */
public static void printList(LinkedList<String> list) {
	System.out.println("\nThis is the list of cars ");
	for(String print: list) {
		System.out.print(print+" ");
	}
	System.out.println();
}
/** 
 * @param list
 *  parameter list to print only distinct values
 */
public static void printNonDuplicates(LinkedList<String> list) {
Set<String> hashSet = new HashSet<>();
for(String non : list) {
	hashSet.add(non);
	}
System.out.print("Non-duplicates are: ");
for(String non: hashSet) {
	System.out.print(non + " ");
	}
}
}