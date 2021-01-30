package ua.com.foxminded.carmanager;

public class Truck extends Car {

	public Truck(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {if (DistanceOnService > 10000) {
		return true;
	}
	return false;

}
}