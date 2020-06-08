package test.human;

public class Men extends Person {
	//생성자
	public Men(Blood blood) {
		super(blood); //부모 생성자에 필요한 값을 전달한다.
		// TODO Auto-generated constructor stub
	}

	public void seeMovie() {
		System.out.println("영화를 봐요");
	}
}
