package test.auto;

public class Car {
	//필드
	protected Engine engine;
	
	//Engine 객체를인자로 전달 받는 생성자
	public Car(Engine engine) {
		//필드에 저장하기
		this.engine=engine;
	}
	//메소드
	public void drive() {
		if(engine==null) {
			System.out.println("Engine객체가 없어서 못 달려요");
			return; //메소드 끝내기
		}
		System.out.println("달려요");
	}
}
