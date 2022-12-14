
public class Player implements ISaveable {
	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;
	
	public Player(String name, int hitPoints, int strength) {
		super();
		this.name = name;
		this.weapon = "Sword";
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}";
	}
	
}
