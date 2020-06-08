package test.main;

import test.human.Blood;
import test.human.Men;
import test.human.Person;

public class MainClass11 {
	/*
	 *  프로그래밍의 목적 : 영화를 보고싶다.
	 *  영화를 보는 프로그래밍의 목적을 달성해보세요
	 */
	/*
	 * Men객체를 생성해보자
	 * 객체 생성은 new 예약어와 함께 class명() 이였지?
	 * 맞다~ class명()는 해당클래스의 생성자를 호출하는 거였지?
	 * Men class의 생성자를 보니 public Men(Blood blood){} 이렇게 생겼네?
	 * 생성자의 인자로 blood type의 참조값을 전달해야겠다
	 */
	public static void main(String[] args) {
		Men m1=new Men(new Blood("+","A"));
		m1.seeMovie();
		
		Blood b1=new Blood("+","o");
		Men m2=new Men(b1);
		m2.seeMovie(); // 이렇게 블러드 객체를 먼저 만들어서 하는 방법도 있음
		
		new Men(new Blood("-","B")).seeMovie(); //Men 객체를 한번 쓰고 버리는 방법도 있음
		
//		Men men=null;
//		men.seeMovie(); // NullPointerException 참조값을 넣어주지않아 실행X
	}
}
