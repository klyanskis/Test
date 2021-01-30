package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN);
		Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		Car renault2 = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		Car Fura = new Truck("Fura", 2020, 1000000, 5000, Color.RED);

		List<Car> cars = new ArrayList<>();
		cars.add(prius);
		cars.add(renault);
		cars.add(renault2);
		cars.add(Fura);
		System.out.println(cars);

		Fura.addDistance(35002.46);
		prius.addDistance(1000);
		prius.addDistance(20.5);
		prius.addDistance(20);
		prius.addDistance(15000);
		renault.addDistance(15000);

		System.out.println(prius);
		System.out.println(renault);
		System.out.println(Fura);

		System.out.println(prius.isReadyToService());
		System.out.println(renault.isReadyToService());
		System.out.println(Fura.isReadyToService());
	}
}
