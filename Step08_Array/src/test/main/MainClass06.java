package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 1. Scanner객체를 이용해서 문자열을 5번 입력받는다
		 * 입력받은 문자열은 차례대로 배열에 저장되어야한다.
		 * 모두 다 입력받은 후 for문을 이용해서 배열에 저장된
		 * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해보세요.
		 */
		//답
		//Scanner 객체를 생성해서 참조값을 지역 변수에 담기
		Scanner scan=new Scanner(System.in);
		//문자열(String) 5개를 담을 수 있는 배열 객체 생성해서 참조값을 지역변수에 담기
		String[] msgs=new String[5];
		
		//5번 문자열을 입력 받기 위해 for문을 구성한다.
		for(int i=0; i<5; i++) {
		System.out.println("문자열 입력:");
		String str=scan.nextLine();
		msgs[i]=str;
		}
		
		for(int i=0; i<msgs.length; i++) {
			//i번째 방에 있는 String객체의 참조값을 불러온다.
			String tmp=msgs[i];
			//콘솔에 출력한다.
			System.out.println(tmp);
		}
		
		/*
		 * 2. Random 객체를 이용해서 로또 번호를 6개 랜덤하세 얻어내서 배열에 저장한다
		 * 모두 다 저장이 되면 for문을 이용해서 배열에 저장된 모든 로또번호를 콘솔창에 순서대로 출력하는 코드 작성.
		 */
//		Random[] lottoNum=new Random[6];
//		Random ran=new Random();
//		int a=ran.nextInt();
//		lottoNum[0]=new Random(ran.nextInt(45)+1);
//		lottoNum[1]=new Random(ran.nextInt(45)+1);
//		lottoNum[2]=new Random(ran.nextInt(45)+1);
//		lottoNum[3]=new Random(ran.nextInt(45)+1);
//		lottoNum[4]=new Random(ran.nextInt(45)+1);
////		lottoNum[5]=new Random(ran.nextInt(45)+1);
//		
//		for(int i=0; i<lottoNum.length; i++) {
//			lottoNum[i]=new Random(a);
//			}
//		System.out.println(lottoNum);
	}
}

