
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 100.0;
		double costPerTonne = 5.0;
		
		
		Garbage g1 = new Garbage();
		
		g1.setWeight(weight);
		g1.setCostPerTonne(costPerTonne);
		
		double cost = g1.costTotal();
		
		System.out.println("getTonnes() is:"+g1.getWeight());
		System.out.println("getCostPerTonne() is: "+g1.getCostPerTonne());
		System.out.println("Testing worker method: "+cost);
		System.out.println("Program by Juho Lee");
	}

}