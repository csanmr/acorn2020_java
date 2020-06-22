package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		//만일 MemberDao객체의 참조값이 필요하다면?
		//MemberDao dao=new MemberDao(); 이렇게 직접 객체 생성 불가능
		
		//static 메소드를 이용해서 MemberDao객체의 참조값을 받아올 수 있다.
		MemberDao dao=MemberDao.getInstance();
		//새로 추가할 회원의 정보라면
		MemberDto dto=new MemberDto();
		dto.setName("덩어리");
		dto.setAddr("상도동");
		//MemberDao의 객체의 메소드를 활용해서 저장할 수 있다.
		dao.insert(dto);
		
		MemberDao dao2=MemberDao.getInstance(); //MemberDao는 하나만 존재하므로 dao와 dao2의 참조값은 같다.
		//수정할 회원의 정보라면
		MemberDto dto2=new MemberDto(1, "김구라", "독산동");
		dao2.update(dto2);
		
	}
}
