package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 가변 배열 객체 생성
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		//배열의 크기 얻어오기
		int size=nums.size();
		Integer num2=nums.get(1); //num2에 1번방
		int num3=nums.get(2); //num3에 2번방의 참조값
		//1번방의 정보 40으로
		nums.set(1, 40);
		//1번방 삭제
		nums.remove(1);
		//전체 방 삭제
		nums.clear();
	}
}
