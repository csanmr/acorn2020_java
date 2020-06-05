package test.main;

import test.human.Blood;

public class MainClass10 {
	public static void main(String[] args) {
		//Blood 객체를 생성해서 참조값을 b1이라는 지역 변수에 담아보세요.
		Blood b1=new Blood("plus", "A"); // Rh+ A형을 의미
		Blood b2=new Blood("plus", "B"); // Rh+ B형을 의미
		
		// Blood 객체의 getter 메소드 사용해보기
		String result1=b1.getRh(); // plus
		String result2=b1.getType(); // A
		
		String result3=b2.getRh(); // plus
		String result4=b2.getType(); // B
	}
}
