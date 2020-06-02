package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Bike 객체를 담을 수 있는 방 3개 짜리 배열객체를 생성해서 참조값을
		 *	  bikes라는 지역변수에 담아보세요.
		 * 2. 배열의 각각의 방(0,1,2)에 Bike객체를 생성해보서 담아보세요
		 * 3. 반복문 for를 이용해서 배열의 각각의 방에있는 Bike객체의 ride()메소드를 호출해보세요
		 */
		
		Bike[] b=new Bike[3];
		b[0]=new Bike();
		b[1]=new Bike();
		b[2]=new Bike();
		
		for(int i=0; i<b.length; i++) {
			//b[i].ride(); 내가 한 것
			//i번째 방에 있는 Bike 참조값 불러오기
			Bike tmp=b[i];
			//Bike객체의 메소드 호출하기
			tmp.ride();
		}
		
	}
}
