
public class Main_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Outlander outlander = new Outlander(36);
		Vehicle r = new Vehicle();
		Car q = new Car();
		r.steer(1);
		q.steer(0);
		outlander.steer(45);
		outlander.accelerate(30);
		outlander.accelerate(20);
		outlander.accelerate(-42);
		
	}

}
