package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass06 {
	public static void main(String[] args) {
		//Messenger클래스의 static 메소드 3개를 하나씩 호출해보세요.
		Messenger.getMessage();
		Messenger.sendMessage("hi");
		Messenger.useCar(new Car());
	}
}
