
public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;
	
	public Hamburger(String name, String meat, double price, String breadRollType) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
		System.out.println(name + " on a " + breadRollType + " with " + meat + " price is " + price);
	}
	
	public void addHamburgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
		this.price += this.addition1Price;
		System.out.println("Added " + name + "for an extra " + price);
	}
	public void addHamburgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
		this.price += this.addition2Price;
		System.out.println("Added " + name + "for an extra " + price);
	}
	public void addHamburgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
		this.price += this.addition3Price;
		System.out.println("Added " + name + "for an extra " + price);
	}
	public void addHamburgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
		this.price += this.addition4Price;
		System.out.println("Added " + name + "for an extra " + price);
	}
	
	

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double itemizeHamburger() {
		return getPrice(); 
		
	}
	
}
