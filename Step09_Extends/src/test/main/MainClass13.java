package test.main;

import test.human.Blood;
import test.human.Men;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 아래의 useMen() 메소드를 호출하는 것
		 *  아래의 useMen() 메소드를 호출해보세요.
		 */
		MainClass13.useMen(new Men(new Blood("+","A")));
		
		//Men객체를 생성해서 참조값을 m1이라는 지역변수에 담기
		Men m1=new Men(new Blood("+","O"));
		//useMen() 메소드 호출하면서 Men객체의 참조값 전달하기
		MainClass13.useMen(m1);  // Men 객체를 먼저 생성해놓고 사용하는 방법도 있다.
	}
	public static void useMen(Men m) {
		m.walk();
		m.study();
		m.seeMovie();
	}
}
