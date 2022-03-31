package assignment2;

public class Customer {
	static int counter;
	int id;
	String address;
	String name;
	int phoneNumber;
	public Customer(String address, String name, int phoneNumber) {
		super();
		this.address = address;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.id = generateId();
	}
	
	private int generateId() {
		return counter++;
	}
}
