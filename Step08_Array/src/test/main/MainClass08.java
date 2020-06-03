package test.main;

import java.util.Random;

/*
 * 1.
 * cherry, apple, banana, melon, 7
 * 5개의 문자열 중에 하나가 랜덤하게 출력되게 해보세요.
 * 
 * 2.
 * 5개의 문자열 중에서 3개가 한 줄에 한번에 랜덤하게 출력되게 해보세요
 * 예) cherry | apple | cherry
 *       7    | apple | melon
 */

public class MainClass08 {
	public static void main(String[] args) {
	//1번	
//		Random ran=new Random();
//		String[] items={"cherry","apple","banana","melon","7"};
//		for(int i=0; i<1; i++) {
//			System.out.println(items[ran.nextInt(5)]);
//		}
	//강사님이 하신 1번
		//랜덤하게 출력할 문자열을 미리 배열에 담아 놓는다.
		String[] items={"cherry","apple","banana","melon","7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//0~4사이의 랜덤한 정수 얻어내기
		int ranNum=ran.nextInt(5);
		System.out.println(items[ranNum]);
		
	//2번
		Random ran1=new Random();
		String[] items1={"cherry","apple","banana","melon","7"};
		for(int i=0; i<1; i++) {
			System.out.println(items[ran.nextInt(5)]+"|"+items[ran.nextInt(5)]+"|"+items[ran.nextInt(5)]);
		}
		
	}

}
