package kh.java.polymorphism.device;

public class Tv extends Device {
	//field
	private int channel;
	
	//constructor
	public Tv() {
		
	}
	public Tv(String brand, String deviceName, int price, int channel) {
		super(brand, deviceName, price);
		this.channel = channel;
	}
	
	//getter & setter
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public String getTvInfo() {
		return getDeviceInfo()+", "+channel;
	}
	
	@Override
	public String getDeviceInfo() {
		return super.getDeviceInfo()+", "+channel;
	}
	
	public void channelUp() {
		System.out.println("현재 채널은 "+ ++channel +"입니다.");
	}
	public void channelDown() {
		System.out.println("현재 채널은 "+ --channel +"입니다.");
	}
}
