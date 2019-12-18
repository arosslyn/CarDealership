package car_dealership;

public class Vehicle {
	private String make;
	private String model;
	private int price;

	public Vehicle(int price, String make, String model) {
		super();
		this.price = price;
		this.make = make;
		this.model = model;
	}
	
	

	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
