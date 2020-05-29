package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;
import test.mypac.YourUtil;
/*  static  |    stack     | heap
 * version  |  car1참조값  | car1의 내용(메소드drive())등
 * send(){} |  car2참조값  | car2의 내용
 * MyUtil과
 * YourUtil의 것들
 */
public class MainClass03 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 drive() 메소드 호출하기
		new Car().drive(); //1회용
		
		//Car 객체를 생성해서 참조값을 car1이라는 지역변수에 담기
		Car car1=new Car(); // 여러 번 사용가능 (stack영역에 참조값 저장)
		//car1안에 들어있는 참조값을 이용해서 drive() 메소드 호출하기
		car1.drive();
		
		//Car 객체를 생성해서 참조값을 car2이라는 지역변수에 담기
		Car car2=new Car();
		//car2안에 들어있는 참조값을 이용해서 drive() 메소드 호출하기
		car2.drive();
		
		//MyUtil클래스의 send() 라는 static 메소드 호출하기
		MyUtil.send();
		//YourUtil 클래스의 up() 이라는 static 메소드 호출하기
		YourUtil.up();
	}
}
