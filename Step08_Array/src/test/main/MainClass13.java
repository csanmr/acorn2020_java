package test.main;

import java.util.Random;
import java.util.Scanner;

/*
 *  [ 컴퓨터와 가위 바위 보 하기 ]
 *  가위[r] 바위[s] 보[p]
 *   
 */

public class MainClass13 {
	public static void main(String[] args) {
//		String[] rsp= {"r","s","p"};
//		Random com=new Random();
//		Scanner me=new Scanner(System.in);
//		System.out.println("가위바위보를 시작");
//		String m=me.nextLine();
//		rsp.equals(m);
//		for(int i=0; i<3; i++) {
//			com.nextInt();
//		}
//		
//		if(r>s && s>p && p>r) {
//			
//		}
		
		//강사님이 한 것
		//가위바위보 문자열을 일단 배열에 담아보자
		String[] items= {"가위","바위","보"};
		//사용자 입력을 받아야 하니 Scanner객체를 생성한다.
		Scanner scan=new Scanner(System.in);
		//컴퓨터가 랜덤하게 가위바위보를 정해야하니 Random 객체를 생성한다.
		Random ran=new Random();
		
		//1. 사용자 입력을 받는다.
		System.out.println("가위(s) 바위(r) 보(p) 입력:");
		String clientInput=scan.nextLine();
		
		//2. "s"는 0, "r"은 1, "p"는 2로 바꿔 보기로하자.
		int me=0;
		if(clientInput.equals("s")) {
			me=0;
		}else if(clientInput.equals("r")){
			me=1;
		}else if(clientInput.equals("p")) {
			me=2;
		}
		//3. computer도 랜덤하게 하나의 숫자를 부여받는다.(0,1,2 중 하나)
		int com=ran.nextInt(3);
		//3.5 win, draw, lose 문자열을 담을 변수를 미리 만들어 준다.
		String result= null;
		
		//4. 승패를 판단해야한다.
		if((me==0&&com==2)|| (me==1&&com==0) | (me==2&&com==1)) {//이기는 경우
			result="win";
		}
//		else if(me==1&&com==0) { 주석 처리한 것을 위에 ||(or) 로 합침
//			result="win";
//		}else if(me==2&&com==1) {
//			result="win";
//		}
		else if(me==com) {//비기는 경우
			result="draw";
		}else {//지는 경우
			result="lose";
		}
		System.out.println("나:"+items[me]+" vs 컴:"+items[com]);
		System.out.println(result);
		
		
		
	}
}
