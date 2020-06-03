package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 2. Random 객체를 이용해서 로또 번호를 6개 랜덤하세 얻어내서 배열에 저장한다
		 * 모두 다 저장이 되면 for문을 이용해서 배열에 저장된 모든 로또번호를 콘솔창에 순서대로 출력하는 코드 작성.
		 */
		Random ran=new Random();
		//로또 번호를 저장할 수 있는 방6개짜리 배열 객체 생성하기
		int[] nums=new int[6];
		//반복문 돌면서 로또번호 6개를 얻어낸다.
		for(int i=0; i<6; i++) {
			int rottoNum=ran.nextInt(45)+1;
			//순서대로 저장하기
			nums[i]=rottoNum;
		}
//		for(int i=0; i<nums.length; i++) {
//			int tmp=nums[i];
//			System.out.println(tmp);
//		}
		for(int tmp:nums) { //위의 for문을 줄인 것
			System.out.println(tmp);
		}
	}
}
