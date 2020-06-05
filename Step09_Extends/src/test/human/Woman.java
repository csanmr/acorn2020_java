package test.human;

public class Woman extends Person {
	//생성자
	public Woman(Blood blood) {
		super(blood); //부모 생성자에 필요한 값을 전달한다.
		// TODO Auto-generated constructor stub
	}
	//메소드
	public void reading() {
		System.out.println("책을 읽어요");
	}

}
