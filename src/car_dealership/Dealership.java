package car_dealership;

/*
 * write a program to simulate a car dealership sales process. We will have employees, working selling vehicles to customers
 * 
 * hint: think about the nouns in this sentence
 */


public class Dealership {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setName("Mike");
		customer1.setAddress("123 anything is possible street");
		customer1.setCashOnHand(12000.00); 
		
		Vehicle vehicle1 = new Vehicle(5000, "Jeep", "Wrangler");
		
		Employee employee1 = new Employee("Matt");
		
		
		customer1.purchaseCar(vehicle1, employee1, false);
	
		
		//System.out.println(employee1.processTransaction(customer1, vehicle1));
		
		//System.out.println(customer1.finaceCar(vehicle1, customer1));
		



	}

}
