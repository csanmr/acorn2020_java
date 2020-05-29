package test.main;

import test.mypac.Member;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 
		 *  1, 김구라, 노량진
		 *  
		 *  이라는 int, String, String type의 값을
		 *  객체의 필드에 저장하는 프로그래밍을 해보세요.
		 *  
		 *  단, 객체를 생성 할 클래스의 이름은 Member로 작성하세요.
		 */
		Member Member1=new Member();
		Member1.num=1;
		Member1.name="김구라";
		Member1.addr="노량진";
		
		// 2, 해골, 행신동도 새로운 Member객체를 생성해서 담아보세요
		Member Member2=new Member();
		Member2.num=2;
		Member2.name="해골";
		Member2.addr="행신동";
		
		//Member객체의 메소드 호출하기
		
		Member1.showInfo();
	}
}
