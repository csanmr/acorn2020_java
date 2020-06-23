package test.main;

import java.util.List;
import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 검색할 회원 번호를 입력 받아서
		 *  입력받은 번호에 해당되는 회원 정보를 얻어와서
		 *  아래와 같은 형식으로 출력
		 *  
		 *  만일 1을 입력한 경우
		 *  
		 *  1 | 김구라 | 노량진
		 */
		//Scanner객체를 이용해서 정수를 입력 받고
		Scanner scan=new Scanner(System.in);
		System.out.println("번호 입력:");
		int num=scan.nextInt();
		
		//MemberDao 객체를 이용해서 입력한 회원 정보를 MemberDto에 담아온다.
		MemberDao dao=MemberDao.getInstance();
		MemberDto tmp=dao.getData(num);
		
		if(tmp==null) { //회원 정보가 없는 경우
			System.out.println(num+" 번 회원은 존재하지 않습니다.");
		}else {
			System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getAddr());
		}
		
		
		
//			if(num==tmp.getNum()) {
//				System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getAddr());
//			}else if(null==tmp) {
//				System.out.println(num+"번 회원은 존재하지 않습니다.");
//			}
		
	}
}
