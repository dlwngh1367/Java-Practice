

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;

	/**
	SalariedProgrammer
 	@param weeklySalary weekly salary of salaried Programmer
*/	
	
	//constructor
	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, 
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber); 

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	//set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}                                             

	//return String representation of SalariedProgrammer object   

	@Override       
	public String toString() {
		return String.format("%nSalaried Programmer: %s %s%nsocial security number: %s%nweekly salary: $%.2f", 
				getFirstName(), getLastName(), getSocialSecurityNumber(), getWeeklySalary());	
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	} 


}

