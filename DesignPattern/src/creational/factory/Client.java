package creational.factory;

public class Client {
	
	private Vehicle vehicle;
	
	public Client(VehicleFactory factory) {
		vehicle=factory.createVehicle();
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

}
