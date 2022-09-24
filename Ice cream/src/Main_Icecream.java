
public class Main_Icecream {

	public static void main(String[] args) {
		
	Icecream icecream1 = new Icecream(); 
	icecream1.setFlavor("vanila");
	icecream1.setMeltingTemperature(10);
	icecream1.setColour("white");
	icecream1.setMainIngredient("sugar");
	icecream1.setIsAllergic(false);
	
	icecream1.getFlavor();
	
//	String flavor = icecream1.getFlavor();
//	String customazation = icecream1.toString();
	System.out.println(icecream1.getFlavor());
	
	
	}
	
}

