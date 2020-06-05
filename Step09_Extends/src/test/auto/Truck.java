package test.auto;

public class Truck extends Car {

	//Engine 객체를 생성자의 인자로 전달받는 메소드
	public Truck(Engine engine) {
		//자식생성자로 받은 객체를 부모 생성자에 전달해주어야 부모 객체가 생성된다.
		super(engine); //super = 부모를 가리킴 super() = 부모의 생성자를 가리킴
		// TODO Auto-generated constructor stub
	}
	//메소드
	public void dump() {
		System.out.println("짐을 쏟아내요");
	}

}
