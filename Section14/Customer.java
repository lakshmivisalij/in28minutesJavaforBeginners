package Section14;

public class Customer {
	
	//state
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	//creating
	public Customer(String name, Address homeAddress) {
		
		this.name = name;
		this.homeAddress = homeAddress;
	}

	//behaviors
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	//to Print Customer Details
	public String toString() { //ovverriding the toString() method
		return String.format("name - [%s], home address - [%s], work address - [%s]", name,homeAddress, workAddress);
	}

}
