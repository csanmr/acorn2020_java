package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("종료(q) 계속(Enter):");
			String str=scan.nextLine();
			if(str.equals("q")) { //무한 루프 탈출 조건
				break; //while문 탈출
			}
			System.out.println("무언가 작업합니다.");
			MainClass12.doGame();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
	public static void doGame() {
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
				for(int i=0;i<nums.length; i++) {
					try {
						//실행의 흐름(스레드)을 1초 잡아놓기
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//.print()메소드를 이용해서 개행기호를 출력하지 않는다. (println은 개행)
					System.out.print("\t"+items[nums[i]]);
				}
				//개행 한번에 하기
				System.out.println();
				
//				System.out.println(items[nums[0]]+"|"+items[nums[1]]+"|"+items[nums[2]]);
				if(nums[0]==nums[1]&&nums[1]==nums[2]) { //3개가 모두 같은 경우
					int point1=point[nums[0]]; //강사님이 추가
					System.out.println(point1+"점 입니다.");
				}else {
					System.out.println("0점 입니다.");
				}
				
	}
}

