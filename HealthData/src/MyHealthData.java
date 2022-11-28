/**
 * This is a programme that analyses the patient's data,
 * Draws conclusions, and shows the results to the user. 
 * This system stores vital health information about a patient.
 * 
 * @author Juho Lee
 * @version 11.0.16
 * @since 1.8.0_342
 */
public class MyHealthData {

		// TODO Auto-generated method stub
		//22F CST8284
		//Assignment 1: MyHealthData.java

		//This system maintains important health information about a patient.
		//Note: This class assumes values passed to the set methods are correct.
		// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


		//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

		//START CODE
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;
		//END CODE


		// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
		//START CODE
	public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear,
			double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;
	}
		//END CODE



		//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.

	/**
	   Returns firstname.
	   @return firstname
	 */
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	   Returns lastname.
	   @return lastname
	 */
	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	   Returns gender.
	   @return gender
	 */
	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	   Returns birth year.
	   @return birth year
	 */
	public int getBirthYear() {
		return birthYear;
	}



	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	/**
	   Returns current year.
	   @return current year
	 */
	public int getCurrentYear() {
		return currentYear;
	}



	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}


	/**
	   Returns height.
	   @return height
	 */
	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}


	/**
	   Returns weight.
	   @return weight
	 */
	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	   Returns age.
	   @return age
	 */
	public int getAge() {
		int age = currentYear-birthYear;
		return age;
	}
	
	/**
	   Returns maximum heart rate.
	   @return maximum heart rate
	 */
	public int getMaximumHeartRate() {
		int maximumHeartRate = 220-getAge();
		return maximumHeartRate;
	}
	
	/**
	   Returns minimum target heart rate.
	   @return minimum target heart rate
	 */
	public double getMinimumTargetHeartRate() {
		double minimumTargetHeartRate = 0.5 * getMaximumHeartRate();
		return minimumTargetHeartRate;
	}
	
	/**
	   Returns maximum target heart rate.
	   @return maximum target heart rate
	 */
	public double getMaximumTargetHeartRate() {
		double maximumTargetHeartRate = 0.85 * getMaximumHeartRate();
		return maximumTargetHeartRate;
	}


		// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!

	/**
	   Returns BMI.
	   @return BMI
	 */
		public double getBMI() {
		   return (getWeight() * 703) / (getHeight() * getHeight());
		} 


		// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION


		

		//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
		   
		// START CODE
		/**
		 * Print statement
		 */
		public void displayMyHealthData() 
		{System.out.printf("First name: %s \nLast name: %s \nGender: %s \nBirth year: %4d \nCurrent year: %4d \nHeight: %3.3f \nWeight: %3.3f \nBMI: %f \nAge: %3d \nMaximumHeartRate: %d \nTargetheartRate: %.1f ~ %.1f\n",
				firstName, lastName, gender, birthYear, currentYear, height, weight, getBMI(), getAge(), getMaximumHeartRate(), getMinimumTargetHeartRate(), getMaximumTargetHeartRate());
			
			
			
			
			//END CODE
		   
		//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

		   System.out.println("BMI VALUES");
		   System.out.println("Underweight: less than 18.5");
		   System.out.println("Normal:      between 18.5 and 24.9");
		   System.out.println("Overweight:  between 25 and 29.9");
		   System.out.println("Obese:       30 or greater");   
		} 

		} // end class MyHealthData




	