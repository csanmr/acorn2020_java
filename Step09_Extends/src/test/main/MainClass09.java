package test.main;

import test.auto.Car;
import test.auto.Dalguji;
import test.auto.Engine;
import test.auto.SportsCar;

public class MainClass09 {
	public static void main(String[] args) {
		//여러분들이 Car클래스를 상속받아서 만든 클래스로 객체를 생성해서
		//아래의 useCar()메소드를 호출해보세요.
		Dalguji d1=new Dalguji(new Engine());
		useCar(d1); //MainClass09.useCar(d1); 과 같음
	}
	
	public static void useCar(Car car) {
		car.drive();
	}
}
