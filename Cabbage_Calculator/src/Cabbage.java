
public class Cabbage {
		private double weight;
		private double costPerKilogram;
		private double price;

	
		public Cabbage(double weight, double kilogram, double price) {
			this.weight = weight;
			this.costPerKilogram = kilogram;
			this.price = price;
		}
		public Cabbage() {
			
		}
		
		public double getWeight() {
			return weight;
		}
		
		//method overloading
		public double getWeight(double weight) {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		public void setKilogram(double costPerKilogram) {
			this.costPerKilogram = costPerKilogram;
		}
		
		public double getKilogram() {
			return costPerKilogram;
		}
		
		public void printReport(double weight, double costPerKilogram) {
			System.out.println("cabbage.printReport()is: \ncabbage: weight "+ weight);
			System.out.println("cost per kilogram "+ costPerKilogram);
		}
		
				
		public double calculatePrice(double weight, double costPerKilogram ) {
			price = weight * costPerKilogram;
			return price;
			
			
		  }	
		}	