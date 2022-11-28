
/**
 * This program outputs salary of each programmer 
 * The program accepts input value and store and
 * calculate their salary.
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */

public class PaymeInterfaceTest  {

	public static void main(String[] args) {

		//Instantiated array type is Payme
		Payme[] paymeObjects = new Payme[6];

		// Each array accepts input value
		paymeObjects[0] = new BasePlusCommissionProgrammer("Juho", "Lee", "009-22-5999", 1, 2, 1200.00, 0.04, 720.00);
		paymeObjects[1] = new HourlyProgrammer("Martin", "Holton", "008-21-5999", 8, 2022, 18.95, 40);
		paymeObjects[2] = new CommissionProgrammer("Ryan", "Yasawe", "039-12-5993", 3, 3, 16500.00, 0.44);
		paymeObjects[3] = new SalariedProgrammer("Echo", "Zhang", "039-12-8376", 320.00);
		paymeObjects[4] = new Invoice("22776","brakes", 3, 300.00);
		paymeObjects[5] = new Invoice("33442", "gear", 5, 90.99);

		System.out.println(
				"Payment for Invoices and Programmers are processed polymorphically:\n"); 


		for (Payme currentPayme : paymeObjects) {
			// output currentPayme and its appropriate payment amount
			System.out.printf("%s \n", currentPayme.toString()); 

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// downcast Payme reference to 
				// BasePlusCommissioProgrammer reference
				BasePlusCommissionProgrammer programmer = 
						(BasePlusCommissionProgrammer) currentPayme;

				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						programmer.getBaseSalary());

			} else if(currentPayme instanceof HourlyProgrammer) {
				HourlyProgrammer hrProgrammer = (HourlyProgrammer) currentPayme;
				System.out.printf("hourly wage: $%.2f; hours worked: %.2f%n", hrProgrammer.getWage(), hrProgrammer.getHours());
				
			} else if (currentPayme instanceof CommissionProgrammer) {
				CommissionProgrammer cmProgrammer = (CommissionProgrammer) currentPayme;
				cmProgrammer.getPaymentAmount();
				
			} else if(currentPayme instanceof BasePlusCommissionProgrammer) {
				BasePlusCommissionProgrammer baseProgrammer = (BasePlusCommissionProgrammer) currentPayme;
				baseProgrammer.getPaymentAmount();
				
			} else if (currentPayme instanceof Invoice) {
				Invoice invoice = (Invoice) currentPayme;
				invoice.toString();
			}
			System.out.printf("Payment due: $%.2f%n ", currentPayme.getPaymentAmount());
		}
	}
}



