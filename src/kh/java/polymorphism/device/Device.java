package kh.java.polymorphism.device;

public class Device {
	//field
		private String brand;
		private String deviceName;
		private int price;
		
		//constructor
		public Device() {
			
		}
		public Device(String brand, String deviceName, int price) {
			this.brand = brand;
			this.deviceName = deviceName;
			this.price = price;
		}
		
		//getter & setter
		//getter
		public String getBrand() {
			return brand;
		}
		public String getDeviceName() {
			return deviceName;
		}
		public int getPrice() {
			return price;
		}
		
		//setter
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public void setDeviceName() {
			this.deviceName = deviceName;
		}
		public void setPrice() {
			this.price = price;
		}
		
		public String getDeviceInfo() {
			return brand+", "+deviceName+", "+price;
		}
}
