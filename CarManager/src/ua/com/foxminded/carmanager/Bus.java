package ua.com.foxminded.carmanager;

public class Bus extends Car {

	public Bus(String name, int yearOfProduction, int price, int weight, Color color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		
			if (DistanceOnService > 50000) {
				return true;
			}
			return false;
		
	}

}
