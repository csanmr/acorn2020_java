package test.main;

import test.human.Blood;
import test.human.Woman;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 독서를 하고싶다
		 *  독서하는 프로그래밍을 해보세요.
		 */
		Woman w1=new Woman(new Blood("+", "O"));
		w1.reading();
		
		Blood b1=new Blood("+","B");
		Woman w2=new Woman(b1);
		w2.reading();
		
		new Woman(new Blood("+", "O")).reading();
	}
}
