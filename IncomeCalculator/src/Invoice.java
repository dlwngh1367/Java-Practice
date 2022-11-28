public class Invoice implements Payme {

	private String partNumber; 
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	/**
	Invoice
 	@param partNumber  partNumber of Invoice
 	@param partDescription partDescription of Invoice
 	@param quantity quantity of Invoice
 	@param pricePerItem PricePerItem of Invoice
*/	
	
	//four-argument constructor
	public Invoice(String part, String description, int count, 
			double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}

	//set part number
	public void setPartNumber(String part) {
		partNumber = part; // should validate
	}

	//get part number
	public String getPartNumber() {
		return partNumber;
	}

	//set description
	public void setPartDescription(String description) {
		partDescription = description; // should validate
	}
	/**
    @return description
	 */

	public String getPartDescription() {
		return partDescription;
	}

	//set quantity
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}
	/**
    @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	//set price per item
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

	/**
    @return price per item
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
	 */   
	@Override
	public String toString() {
		return String.format("%n%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} 

	/**
    @return payment amount
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}


