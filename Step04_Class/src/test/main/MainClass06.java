package test.main;

import test.mypac.Box;
import test.mypac.Car;
import test.mypac.Member;
import test.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		Member a=Box.mem; //null
		Rect b=Box.rect; //null
		Car c=Box.car; //null
		c.drive(); //메소드 호출가능
		Box.car.drive();//이렇게 사용할 수도 있다.
		System.out.println();
		
		//a.showInfo(); // a는 null이므로 NullPointerException 발생
		//b.getArea(); // b는 는 null이므로 NullPointerException 발생
	}
}
