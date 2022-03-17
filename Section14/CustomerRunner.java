package Section14;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line1","Hyderabad", "5000035");
		Customer cust = new Customer("Visali", homeAddress);

		Address workAddress = new Address("line2 work", "Bangalore", "560036");
		cust.setWorkAddress(workAddress);
		System.out.println(cust);
	}

}
