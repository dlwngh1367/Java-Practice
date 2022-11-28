
public class Calculator {
	public static void main(String[] args) {
		
		double weightOfSweater = 19.5;
		double costOfYarnPerOunce = 1.25;
				
		Sweater s1 = new Sweater();
		
		s1.setWeightOfSweater(weightOfSweater);
		s1.setCostOfYarnPerOunce(costOfYarnPerOunce);
	
		double cost = s1.wholeSaleCost();
		
		System.out.println("getOunces() is: "+s1.getWeightOfSweater());
		System.out.println("getCostPerOunce() is: "+s1.getCostOfYarnPerOunce());
		System.out.println("Testing worker method: "+cost);
		System.out.println("Program by Juho Lee");

	}
}
