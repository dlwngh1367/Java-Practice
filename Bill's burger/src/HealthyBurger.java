
public class HealthyBurger extends Hamburger{
	
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger(String meat, double price) {
		super("Health hamburger", meat, price, "Brown rye roll");
		
	}

	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = getPrice() + price;
		setPrice(this.healthyExtra1Price);
		System.out.println("Added " + name + " an extra " + price);
	}
	
	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = getPrice() + price;
		setPrice(this.healthyExtra2Price);
		System.out.println("Added " + name + " an extra " + price);
	}
	
	public double itemizeHamburger() {
		return getPrice(); 
	}
	
}
