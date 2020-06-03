package test.main;

import java.util.Random;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * cherry,apple,banana,melon,7
		 * 10,20,30,40,1000
		 * 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요
		 * 다 같아야 점수
		 * 예) cherry | cherry | cherry
		 * 10점입니다.
		 * 
		 * apple | apple | apple
		 * 20점입니다.
		 */
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		//랜덤하게 얻어낸 3개의 정수를 저장할 배열
		int[] nums=new int[3];
		//랜덤하게 출력할 문자열을 미리 배열에 담아놓는다.
		String[] items={"cherry","apple","banana","melon","7"};
		//부여 할 점수를 미리 배열에 담아놓는다.
		int[] point= {10,20,30,40,1000};
		//0~4사이의 랜덤한 정수3개 얻어내기
		for(int i=0; i<3; i++) {
			int ranNum=ran.nextInt(5);
			nums[i]=ranNum; // 배열에 저장
			}
		System.out.println(items[nums[0]]+"|"+items[nums[1]]+"|"+items[nums[2]]);
		if(nums[0]==nums[1]&&nums[1]==nums[2]) { //3개가 모두 같은 경우
			int point1=point[nums[0]]; //강사님이 추가
			System.out.println(point1+"점 입니다."); //강사님이 추가
//			if(items[nums[0]]=="cherry") {  //주석부분은 내가 한 것
//				System.out.println(point[0]);
//			}
//			else if(items[nums[0]]=="apple") {
//				System.out.println(point[1]);
//			}
//			else if(items[nums[0]]=="banana") {
//				System.out.println(point[2]);
//			}
//			else if(items[nums[0]]=="melon") {
//				System.out.println(point[3]);
//			}
//			else if(items[nums[0]]=="7") {
//				System.out.println(point[4]);
//			}
//			else { //하나라도 다른 경우
//				System.out.println("0점입니다.");
//			}
		}else {
			System.out.println("0점 입니다.");
		}
		
	}
}
