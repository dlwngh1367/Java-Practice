
public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	private double customerJuho;
	
	
	
	public Account(String number, double balance, String customerName, String customerEmailAddress, double phoneNumber, double customerJuho) {
	
	}
	
	public double getCustomerJuho() {
		return customerJuho;
	}
	
	public Account() {
		this("내 진짜 번호",2.50,"Default name", "Default address", "default phone",1);
		System.out.println("Empty constructor called");
	}
	
	public Account(String number, double balance, String customerName, String customerEmailAddress,
			String customerPhoneNumber, double customerJuho) {
		System.out.println("Account constructore with parameters called");
		this. number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerJuho = customerJuho;
	}
	
	
	
	public Account(String customerName, String customerEmailAddress, String customerPhoneNumber, double customerJuho) {
		this("99999",100.55, customerName, customerEmailAddress, customerPhoneNumber, customerJuho);
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is "+ this.balance);
	}
	
	public void withdrawal(double withdrwalAmount) {
		if(this.balance - withdrwalAmount <=0) {
			System.out.println("Only "+ balance + " available. Withdrawal not processed");
		} else {
			balance -= withdrwalAmount;
			System.out.println("Withdrawal of " + withdrwalAmount + " processed. Remaining balance= " + this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customername) {
		this.customerName = customername;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	
}

