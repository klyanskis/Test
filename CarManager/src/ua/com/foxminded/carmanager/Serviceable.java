package ua.com.foxminded.carmanager;

public interface Serviceable {
	boolean isReadyToService();

	public int getDistanceOnService();

	public void addDistance(int additionalDistance);

	public void addDistance(double additionalDistance);

	public double getDistance();
}
