
public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week

	/**
	HourlyProgrammer
 	@param wage the wage of HourlyProgrammer
 	@param hours the hours of HourlyProgrammer
*/
	
	//constructor
	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year, 
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	} 

	//set wage
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	} 

	/**
    @return return wage
	 */
	public double getWage() {
		return wage;
	} 

	//set hours worked
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	} 
	/**
    @return return hours worked
	 */
	
	public double getHours() {
		return hours;
	} 

	//calculate earnings; override abstract method earnings in Programmer

	//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
	//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

	public double getPaymentAmount() {                                            
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();   
		}
		else {                                                             
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}                                          

	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
	 */            
	@Override  
	public String toString() {
		return String.format("%nhourly Programmer: %s %s%nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());	
	}


}


