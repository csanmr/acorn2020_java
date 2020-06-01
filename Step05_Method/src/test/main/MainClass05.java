package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass05 {
/*
 *  test.mypac 패키지에 다양한 모양의 메소드를 가지는
 *  클래스를 정의하고
 *  그 클래스를 이용해서 객체도 생성하고 메소드도 호출해보세요.
 */
	public static void main(String[] args) {
		Car c=new Car();
		c.name="소나타";
		c.drive();
		MyObject a=new MyObject();
		a.doSome(new Radio(), new Speaker());
		a.getCar();
		a.setNum(1);
		a.getGreeting();
		
	}
}
