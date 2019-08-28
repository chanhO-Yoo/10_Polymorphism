package kh.java.polymorphism.test;

public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		p.say();
	}
}

class Parent {
	public void say() {
		System.out.println("아빠다.");
	}
}

class Child extends Parent{
	@Override
	public void say() {
		System.out.println("자식입니다.");
	}
	
	public void doGame() {
		System.out.println("자식이 게임을 한다.");
	}
}
