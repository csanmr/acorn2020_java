package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적 : 키보드로 부터 문자열을 입력받고싶다.
		 *  입력받아서 콘솔창에 출력
		 */
		Scanner scan=new Scanner(System.in);
		//키보드로 입력받기 위해서는 일단 콘솔창을 열리게 해야한다.
		System.out.println("문자열을 입력하세요:");
		//Scanner 객체의 메소드를 이용해서 문자열(String)입력 받기.
		String str=scan.nextLine();
		System.out.println(str);
		str.length();
		System.out.println("main 메소드가 종료됩니다.");
	}
}
