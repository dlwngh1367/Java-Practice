
public class Main {

	public static void main(String[] args) {
		House blueHouse = new House ("blue");
		House anotherHouse = blueHouse;
		
		System.out.println(blueHouse.getColour());
		System.out.println(anotherHouse.getColour());

		anotherHouse.setColour("red");
		System.out.println(blueHouse.getColour());
		System.out.println(anotherHouse.getColour());
		
		House greenHouse = new House("green");
		anotherHouse = greenHouse;
		
		System.out.println(blueHouse.getColour());
		System.out.println(anotherHouse.getColour());
		System.out.println(greenHouse.getColour());
		
	}

}
