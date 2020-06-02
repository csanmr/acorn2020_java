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
		Scanner[] scan=new Scanner[5];
		System.out.println("문자열을 입력하세요:");
		String str=scan[0].nextLine();
		scan[0]=new Scanner(System.in);
		scan[1]=new Scanner(System.in);
		scan[2]=new Scanner(System.in);
		scan[3]=new Scanner(System.in);
		scan[4]=new Scanner(System.in);
		//Scanner 객체의 메소드를 이용해서 문자열(String)입력 받기.
		for(int i=0; i<scan.length; i++) {
			System.out.println(scan[i]);
			
			}
		System.out.println("main 메소드가 종료됩니다.");
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

