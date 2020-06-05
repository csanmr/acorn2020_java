package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		//Phone클래스로 객체 생성해서 참조값을 지역변수에 담기
		Phone p1=new Phone();
		Object p2=new Phone();
		
		//HandPhone 클래스로 객체 생성해서 참조값을 지역 변수에 담기
		HandPhone p3=new HandPhone(); // HandPhone, Phone, Object 타입 사용 가능
		Phone p4=new HandPhone(); // Phone, Object
		Object p5=new HandPhone(); //Object
		
		//이미 만들어진 객체의 참조값을 다른 type으로 받아보기
		Phone p6=p3; // p3의 참조값(id)을 그대로 p6에 넣음 
		Object p7=p3;
		HandPhone p8=(HandPhone)p5; //HandPhone p8=p5;하면 문법오류, 캐스팅 연산자 사용하면 가능
		//String str=p3; //오류! 부모타입으로는 받을 수 있지만 상관없는 타입으로는 불가능
		p8.mobileCall();
		
		byte b=10;
		int i=b;
		int i2=10;
		byte b2=(byte)i2;
		
	}
}
