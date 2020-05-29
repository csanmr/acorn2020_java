package test.main;

import test.mypac.Marine;

public class MainClass07 {
	public static void main(String[] args) { //이것도 static 메소드이다
	/*
	 *  Marine객체를 생성해서 참조값을 1이라는 지역변수에 담아보세요.
	 */
	
		Marine m1=new Marine();
		m1.move();
		m1.attack();
		m1.energy-=10; //여기서 감소시키면 30으로 표시
		m1.showEnergy();
		System.out.println("m1객체를 사용했습니다.");
		
		Marine m2=new Marine();
		m2.move();
		m2.attack();
		m2.showEnergy();
		System.out.println("m2객체를 사용했습니다.");
		
		//Marine의 공격력을 올려보자
		Marine.attackPower+=2;
		m1.attack();
		m2.attack();
		
		//m1의 에너지 감소 시키기 (m2의 에너지에 영향을 주지않는다.)
		m1.energy -= 10; //여기서도 감소시켜서 값은 20
		m1.showEnergy();
		m2.showEnergy();
	}
}
