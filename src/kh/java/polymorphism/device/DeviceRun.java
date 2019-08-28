package kh.java.polymorphism.device;

public class DeviceRun {
	public static void main(String[] args) {
		DeviceRun d = new DeviceRun();
//		d.test1();
//		d.test2();
//		d.test3();
		d.test4();
	}
	
	public void test1() {
		Laptop laptop = new Laptop("레노버","씽크패드",1000000,256);
		System.out.println(laptop.getLaptopInfo());
		Tv tv = new Tv("삼성","평면tv",2000000,10);
		System.out.println(tv.getTvInfo());
		
		tv.channelUp();
		tv.channelDown();
		
		System.out.println("=========================");
		//다형성
		Device d1 = new Laptop("레노버","씽크패드",1000000,256);
		System.out.println(d1.getDeviceInfo());
		System.out.println(((Laptop)d1).getLaptopInfo());
		
		Device d2 = new Tv("삼성","평면tv",2000000,10);
		System.out.println(((Tv)d2).getTvInfo());
		
		//Device타입에서 자식클래스 Tv의 필드/메서드에 접근할 수 없다.
		((Tv)d2).channelUp();
		((Tv)d2).channelDown();
	}
	
	//다형성의 장점
	//자식객체를 묶어서 관리가 가능하다.
	public void test2() {
		Device[] arr = new Device[4];
		arr[0] = new Laptop("레노버", "씽크패드", 1000000, 256);
		arr[1] = new Tv("삼성", "평면tv", 2000000, 10);
		arr[2] = new Laptop("애플", "맥북프로", 1500000, 256);
		arr[3] = new Tv("LG", "커브드tv", 3000000, 50);
		
		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i].getDeviceInfo());
			//Tv타입이면 tv정보를, Laptop타입이면 laptop정보 출력
			printInfo(arr[i]);
		}
	}
	
	public void printInfo(Device d) {
		String str = "";
		
		if(d instanceof Tv) {
			str = ((Tv)d).getTvInfo();
		}
		else if(d instanceof Laptop) {
			str = ((Laptop)d).getLaptopInfo();
		}
		System.out.println(str);
	}
	
	//동적 바인딩
	//부모타입으로 선언된 자식 객체의
	//오버라이딩 된 메서드를 호출하는 경우
	//부모타입이 아닌 자식객체의 메서드가 호출된다.
	public void test3() {
		Tv t = new Tv("삼성","평면tv",2000000,10);
		System.out.println(t.getDeviceInfo());
		
		Device d = t;
		System.out.println(d.getDeviceInfo());
	}
	
	public void test4() {
		Device[] arr = new Device[4];
		arr[0] = new Laptop("레노버", "씽크패드", 1000000, 256);
		arr[1] = new Tv("삼성", "평면tv", 2000000, 10);
		arr[2] = new Laptop("애플", "맥북프로", 1500000, 256);
		arr[3] = new Tv("LG", "커브드tv", 3000000, 50);
		
		for(int i=0; i<arr.length; i++) {
			printInfo2(arr[i]);
		}
	}
	
	public void printInfo2(Device d) {
		System.out.println(d.getDeviceInfo());
	}
}
