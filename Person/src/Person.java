
public class Person {
	public String FirstName;
	public String LastName;
	public int age;
	
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0 || age > 100) {
		this.age = 0;	
		}
		this.age = age;
	}
	public boolean isTeen() {
		if(this.age > 12 && this.age < 20) {
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		if (this.FirstName.isEmpty()) {
			return this.LastName;
		} else if (this.LastName.isEmpty()) {
			return this.FirstName;
		}
		return this.FirstName + this.LastName;		
	}
		
}
