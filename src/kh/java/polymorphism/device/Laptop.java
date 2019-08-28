package kh.java.polymorphism.device;

public class Laptop extends Device {
	//field
	private int capacity; //저장공간
	
	//constructor
	public Laptop() {
		
	}
	
	public Laptop(String brand, String deviceName, int price, int capacity) {
		super(brand, deviceName, price);
		this.capacity = capacity;
	}
	
	//getter & setter
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getLaptopInfo() {
		return getDeviceInfo()+", "+capacity;
	}
	
	@Override
	public String getDeviceInfo() {
		return super.getDeviceInfo()+", "+capacity;
	}
}
