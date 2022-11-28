
public class Main {

	public static void main(String[] args) {
		
		System.out.println("hi");
		int x = 4;
		System.out.println("the value of x is "+x);
		
		if (x == 0) {
			System.out.println("we are in the if statement!");
		}else if (x ==1) {
			System.out.println("x equals 1");
		}else if (x ==2) {
			System.out.println("x equals 2");
		}else if (x ==3) {
			System.out.println("x equals 3");
		}else if (x ==4) {
			System.out.println("x equals 4");
		}else
			System.out.println("x doesn't equal 1,2,3 or 4");
		
		System.out.println("...and now we are out of it");
		
		if (x > 5) {
			System.out.println("x is bigger than 5");
			System.out.println("so much bigger");
		}else {
			System.out.println("x is not bigger than 5");
		}
		

		if (x != 5)
			System.out.println("x does not equal 5");
		else {
			System.out.println("x does equal 5");
			System.out.println("exactly 5");
		}
			
		
		double z = 12;
		
		if (x <= 4)
			System.out.println("x is smaller than or equal to 5");
		
		char q = 'q';
		
		if (q == q)
			System.out.println("q is q");
		
	
		
		if (z < 5)
			System.out.println("z is smaller than 5");
		else if (z < 10)
			System.out.println("z is smaller than 10");
		else if (z < 20)
			System.out.println("z is smaller than 20");
		else
			System.out.println("z is bigger than 19");
		
		
		int a = 1;
		int b = 1;
		System.out.println(a == b);
		
		String aString = "a string";
		String aString2 = "a string";
		String aString3 = "a";
		aString3+=" string";
		
		System.out.println(aString+"*"+aString2+"*"+aString3+"*");
		
		System.out.println("aString == aString2: "+(aString == aString2));
		System.out.println("aString == aString3: "+ (aString == aString3));
		
		
		System.out.println("aString.equals(aString3)): "+aString.equals(aString3));
		
		String name = "Charles";
		if (name.equals("Charles"))
			System.out.println("Hello professor Xavier");
		else
			System.out.println("access denied");
		
	
		String month = "Nov";
		
		if (month.equals("jan")) {
			System.out.println(1);
		}else if (month.equals("feb")) {
			System.out.println(2);
		}else if (month.equals("mar")) {
			System.out.println(3);
		}else if (month.equals("apr")) {
			System.out.println(4);
		}else if (month.equals("may")) {
			System.out.println(5);
		}else if (month.equals("jun")) {
			System.out.println(6);
		}else if (month.equals("jul")) {
			System.out.println(7);
		}else if (month.equals("aug")) {
			System.out.println(8);
		}else if (month.equals("sep")) {
			System.out.println(9);
		}else if (month.equals("oct")) {
			System.out.println(10);
		}else if (month.equals("nov")) {
			System.out.println(11);
		}else if (month.equals("dec")) {
			System.out.println(12);
		}else
			System.out.println(-1);
		
		
		double h = 0.1;
		double i = 0.0999999;
		
		System.out.println("h is equal to i? "+(h == i));
		
		
		System.out.println("h is epsilonEqual to i: "+epsilonEquals(h,i,0.00001));
		
		boolean aVar = true;
		boolean bVar = false;
		
		
		if (aVar && bVar)
			System.out.println("aVar and bVar are BOTH true");
		else
			System.out.println("one or both of aVar and bVar is false");
		
		
		if (aVar || bVar)
			System.out.println("at least one of aVar and bVar is true");
		else
			System.out.println("aVar and bVar are both false");
				
		
	
		if (!aVar)
			System.out.println("aVar is false");
		else
			System.out.println("aVar is true");
		
		

		if (2 + 2 == 4 && !"a".equals("a")||epsilonEquals(h,i,0.0001))
			System.out.println("this rather complex expression is true");
		else
			System.out.println("the complex expression above is false");
		

		
	}

	public static boolean epsilonEquals(double x, double y, double epsilon) {
		
		if (Math.abs(x - y) <= epsilon) 
			return true;
		
		return false;
	}
	
	public static double calcT(double a, double t) {
		return a*(1+t/100);
	}

	public static double calculateTax(double amount, double tax) {
		return amount*(1+tax/100);
	}
}


