package kh.java.polymorphism.animal;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest a = new AnimalTest();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
		a.test5();
		
	}
	
	public void test1() { 
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		tiger.attack();
		tiger.say();
		lion.stomp();
		lion.say();
		
		//다형성
		//부모타입의 참조변수에 자식객체를 담아서 제어하는 것
		Animal a1 = tiger;
		Animal a2 = lion;
		
		//부모타입의 참조변수를 사용하면
		//부모타입에서 선언된 자원(필드,메서드)만 접근가능
//		a1.attack();
		a1.say();
//		a2.stomp();
		a2.say();
		
		//형변환 : 자식클래스타입으로 명시적형변환 가능
		((Tiger)a1).attack();
		((Lion)a2).stomp();
	}
	
	public void test2() {
		Animal[] arr = new Animal[3];
		arr[0] = new Tiger();
		arr[1] = new Lion();
		arr[2] = new Tiger();
		
		//instanceof 연산자
		//참조변수가 참조하는 객체의 실제 타입을 체크하는 연산자
		//이항연산자로, 좌항에는 참조변수, 우항에는 체크할 타입
		//결과값은 true/false
		//true라면 형변환을 보장한다.
		
//		((Lion)arr[0]).stomp();
		
//		if(arr[0] instanceof Tiger) {
//			((Tiger)arr[0]).attack();
//		}
//
//		if(arr[1] instanceof Lion) {
//			((Lion)arr[1]).stomp();
//		}

		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Tiger) {
				((Tiger)arr[i]).attack();
			}

			if(arr[i] instanceof Lion) {
				((Lion)arr[i]).stomp();
			}
		}
	}
	
	//형변환
	// - upcasting : 부모타입으로 변환. 암묵적 형변환
	// - downcasting : 자식타입으로 변환. 명시적 형변환
	public void test3() {
		//upcasting
		Animal a = new Tiger();
		//downcasting
		((Tiger)a).attack();
	}
	
	//매개변수에서 다형성 활용하기
	public void test4() {
		Tiger t = new Tiger();
		Lion l = new Lion();
		
		action(t);
		action(l);
	}
	
	//파라미터 animal은 Animal클래스의 모든 자식객체를 전달받을 수 있다.
	public void action(Animal animal) {
		if(animal instanceof Tiger) {
			((Tiger)animal).attack();
		}
		else if(animal instanceof Lion) {
			((Lion)animal).stomp();
		}
	}
	
	//리턴타입에서 다형성 활용하기
	// - 리턴된 자식객체를 부모타입의 변수에 담기
	public void test5() {
//		Tiger t = getTiger();
//		Lion l = getLion();
		
		Animal a1 = getTiger();
		Animal a2 = getLion();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
	public Lion getLion() {
		return new Lion();
	}
}
