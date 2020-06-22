package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="이정호";
		String addr="독상동";
		//MemberDto 객체에 수정할 회원의 정보를 담아서
		//MemberDto dto=new MemberDto(num, name, addr); 이렇게 생성하기도 가능
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		dto.setNum(num);
		//메소드 호출하면서 전달
		update(dto);
	}
	//인자로 MemberDto 객체를 전달받아서 DB에 수정작업을 하는 메소드
	public static void update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnect().getConn();
			String sql="UPDATE member"+" SET name=?,addr=?"+" WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			pstmt.executeUpdate();
			System.out.println("회원정보가 수정되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}
