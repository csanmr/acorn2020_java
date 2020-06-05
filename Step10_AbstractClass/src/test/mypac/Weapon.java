package test.mypac;
/*
 *  구현되지않은 추상메소드를 멤버로 가지고 있는 클래스는
 *  abstract 예약어를 붙여서 정의해야한다
 */

public abstract class Weapon {
	//무기를 작동하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	//공격하는 메소드/구현되지않은,미완성 추상메소드를 만들 때는 abstract예약어를 붙여서 메소드를 정의
	public abstract void attack();
	
	
}
