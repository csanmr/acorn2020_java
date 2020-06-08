package test.main;

import test.mypac.Weapon;


public class MainClass06 {
	//static inner class로 Weapon추상 클래스 상속 받기
	public static class yourWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("아무나 공격해요");
			// TODO Auto-generated method stub	
		}	
	}
	public static void main(String[] args) {
		/*
		 * useWeapon() 메소드를 호출하는게 목적이다.
		 * 호출하려고 보니 Weapon 추상클래스type객체의 참조값이 필요하다
		 * 따라서 Weapon 추상 클래스를 상속받은 클래스를 파일로 만들어야 된다.
		 * 근데 불금이다보니 만사가 귀찮다. 클래스를 파일로 만들기 싫다
		 * 내부클래스(inner Class)로 만들고 싶다.
		 */
		Weapon w1=new yourWeapon();
		useWeapon(w1);
		
		//local inner class로도 이용해보자
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("우리가 공격해요");
				}
			public void fly() {
				System.out.println("날아요");
			}
			}
			Weapon w2=new OurWeapon();
			useWeapon(w2);
			
			OurWeapon w3=new OurWeapon(); //fly를 쓰려면 OurWeapon타입으로 받아야함.
			w3.fly();
			
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
