public abstract class Programmer implements Payme {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	/**
	Programmer
 	@param firstName firstName of Programmer
 	@param lastName lastName of Programmer
 	@param socialSecurityNumber social security number of Programmer
*/	

	/**
    @return first name
	 */
	String getFirstName() {
		return firstName;
	}

	/**
    @return last name
	 */
	String getLastName() {
		return lastName;
	}

	/**
    @return social security number
	 */
	String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	/**
    @return full name
	 */
	String getFullName() {
		return firstName + " "+ lastName;
	}

	//three-argument constructor
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}


	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
	 */   
	
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	} 


	public abstract double earnings(); 

} 


