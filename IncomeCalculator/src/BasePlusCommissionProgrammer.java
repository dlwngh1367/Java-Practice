
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

	private double baseSalary; // base salary per week
	
	/**
		BasePlusCommissionProgrammer
	 	@param baseSalary the salary of BasePlusCommissionProgrammer
	*/
	
	//constructor
	public BasePlusCommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, 
				month, year, grossSales, commissionRate);
		this.baseSalary = baseSalary;

		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");

		}

		this.baseSalary = baseSalary;                
	}

	//set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	} 
	
	/**
    @return base salary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	/**
    @return payment amount
	 */
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	}

	/**
    @return String representation of BasePlusCommissionProgrammer object
	 */
	@Override 
	public String toString() {
	return String.format("base-plus commission programmer: %s %nsocial security number: %s%ngross sales: $%.2f; commission rate: %.2f; base salary: $%.2f", 
			super.getFullName() , super.getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getBaseSalary());
} 
}
