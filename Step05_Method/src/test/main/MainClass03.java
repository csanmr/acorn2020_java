package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass03 {
	public static void main(String[] args) {
		MyObject obj1 = new MyObject();
		Car c=new Car();
		// .setNum(), .setName(), .useCar() 메소드를 호출해보세요.
		obj1.setNum(1);
		obj1.setName("김구라");
		obj1.useCar(c); //혹은 obj1.userCar(new Car());
		
		/*
		 *  int a=1;
		 *  String b="김구라"
		 *  obj1.setNum(a);
		 *  obj1.setName(b); 이런 식으로도 가능
		 */
	}
}
