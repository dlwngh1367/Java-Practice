
public class CommissionProgrammer extends Programmer { 

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	/**
	CommissionProgrammer
 	@param commissionRate the rate of CommissionProgrammer
 	@param grossSales the gross weekly sales of CommissionProgrammer
*/
	
	//constructor
	public CommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 

	//set gross sales amount on the creation of apps
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	} 

	/**
    @return gross sales
	 */
	public double getGrossSales() {
		return grossSales;
	} 

	//set commission rate
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	} 
	/**
    @return commission rate
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 


	/**
    @return payment amount
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}
	
	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
	 */
	public String toString() {
		return String.format("%ncommission Programmer: %s %s%nsocial security number: %s%ngross sales: $%.2f; commission rate: %.2f", 
				getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate());	
	}


	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

}

