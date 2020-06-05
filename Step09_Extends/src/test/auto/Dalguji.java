package test.auto;

public class Dalguji extends Car {

	public Dalguji(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("겁나 느리게 달려요");
	}
	public void cow() {
		System.out.println("이번엔 소가 끌어요");
	}
}
