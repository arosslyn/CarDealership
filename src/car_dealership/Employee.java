package car_dealership;

public class Employee {
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance ) {
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, 1000.00);
			//revise this method to check for the boolean of good credit or not and to do something with that.
			
			
		}
		else if(vehicle.getPrice() < customer.getCashOnHand()) {
			this.processTransaction(customer, vehicle);
		}
			
		
	}
	public boolean runCreditHistory(Customer customer, double doubleAmount) {
		double amountInChecking =  doubleAmount;
		
		//this is the minimum balance that the customer must have in order to have good credit to be able to purchase a car.
		double minimalBalance = 500.00;
		
		if(doubleAmount > minimalBalance) return true;
		 return false;
	}
	public String processTransaction(Customer customer, Vehicle vehicle) {
		if(customer.getCashOnHand() >= vehicle.getPrice()) {
			System.out.println("Congrats on your new " + vehicle.getMake());
		}
		else if(customer.finaceCar(vehicle, customer) == true) return "please visit the finace department to complete you transaction";
		
			return "I am sorry you do not have enough money to purchase your car nor can you get financed by us";

	
	}
	
	/*
	 * Employee class method
	 * handleCustomer(Customer customer, boolean finance, Vehicle vehicle)
	 * if(finance == true)
	 * 	runCreditHistory(Customer customer, double doubleAmount)
	 * else if(vehicle.getPrice <= customer.getCashOnHand
	 * 		processTransaction(Customer customer, Vehicle vehicle)
	 * else:
	 * 		tell customer to being more money
	 * 
	 */

}
