package test.main;

import java.util.Random;

/*
2.
* 5개의 문자열 중에서 3개가 한 줄에 한번에 랜덤하게 출력되게 해보세요
* 예) cherry | apple | cherry
*       7    | apple | melon
*       
*/
public class MainClass09 {
	public static void main(String[] args) {
	//강사님이 하신 2번
			//랜덤한 숫자를 얻어내기 위한 객체
			Random ran=new Random();
			//랜덤하게 얻어낸 3개의 정수를 저장할 배열
			int[] nums=new int[3];
			//랜덤하게 출력할 문자열을 미리 배열에 담아놓는다.
			String[] items={"cherry","apple","banana","melon","7"};
			//0~4사이의 랜덤한 정수3개 얻어내기
			for(int i=0; i<3; i++) {
				int ranNum=ran.nextInt(5);
				nums[i]=ranNum; // 배열에 저장
				}
			//System.out.println(items[ran.nextInt(5)]+"|"+items[ran.nextInt(5)]+"|"+items[ran.nextInt(5)]);
			System.out.println(items[nums[0]]+"|"+items[nums[1]]+"|"+items[nums[2]]);
	}
}
