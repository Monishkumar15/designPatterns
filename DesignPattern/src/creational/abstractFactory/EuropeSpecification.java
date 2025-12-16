package creational.abstractFactory;

public class EuropeSpecification implements CarSpecification{

	@Override
	public void display() {
		System.out.println("Europe car specification: Fuel efficiency");
	}
}
