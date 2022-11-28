/**
 * This is a program focuses on the OOP concept of Inheritance,
 * using super classes, subclasses, super keyword, toString(), overriding and more.
 * 
 * File name: SalesAgent.java
 * Author: Juho Lee
 * Course: CST8284
 * Professor: Justin martin
 * Assignment: Lab5
 * Date: November 10, 2022 
 * Purpose: If the SalesSupervisor class inherits the name, age, and toString() method 
 * 			from the SalesAgent class, and SalesChief class inherits from SalesSupervisor class.
 * 
 * @author Juho Lee
 * @version 11.0.16
 * @since 1.8.0_342
 * 
 */

/**
   This class shows a Sales Agent with a name and age.
 */
public class SalesAgent {  
	// variables
	private String name;
	private int age;
	
	
	//default constructor
	public SalesAgent() {

	}
	
	/**
    In this portion of your code, construct a SalesAgent object.
    @param n the name of the Sales Agent
    @param a the age of the Sales Agent
	 */
	
	//constructor with parameters
	public SalesAgent(String n, int a) {
		name = n;
		age = a;
	}

	/**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
	 */

	public String toString() {  
		return "Sales Agent [name=" + name + ",age=" + age + "]";
	}

	
}