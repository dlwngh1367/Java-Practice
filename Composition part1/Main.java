
public class Main {
	public static void main(String[] args) {
		Dimensions dimension = new Dimensions(20,20,5);
		Case theCase = new Case("220B","Dell","240",dimension);
		
		Monitor theMonitor = new Monitor("27 inch beast","Acer", 27, new Resolution(2540,1440));
		Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
		
		PC thePC = new PC(theCase,theMonitor,theMotherboard);
		thePC.getTheMonitor().drawPixelAt(1500,1200, "Red");
		thePC.getMotherboard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPower();
		
		
	}

}
