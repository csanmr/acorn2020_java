package test.main;

import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone type의 지역변수 p1을 만들준비만하고 만들어지지 않은 상태
		SmartPhone p1;
		//SmartPhone type의 지역변수 p2를 만들고 비워둔 상태(참조값이 담기지 않은)
		SmartPhone p2=null;
		//SmartPhone type의 지역변수 p3를 만들고 참조값을 넣어둔 상태
		SmartPhone p3=new SmartPhone();
		
		//p1은 아직 만들어지지 않았기 때문에 문법이 성립하지 않음.
		//p1.call(); //오류
		
		
		//p2는 비어있는 (null이 들어있는) 상태이기 때문에 실행시 NullPointerException이 발생
		p2.call(); //java.lang.NullPointerException 발생
		
		//p3는 참조값이 들어있으므로 정상사용 가능
	}
}
