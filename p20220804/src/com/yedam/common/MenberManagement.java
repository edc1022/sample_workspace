package com.yedam.common;

import java.util.ArrayList;
import java.util.List;


public class MenberManagement extends DAO {
	
	//싱글톤 생성
	private static MenberManagement mm = null;
	
	//private 생성자 생성
	private  MenberManagement () {
		
	}
//단 하나의 객체를 사용할 수 있도록 메소드 생성. getInstance만 통해서 이용가능
	public static MenberManagement getInstance() {
		if(mm == null) {
			return new MenberManagement ();
		}else {
			return mm;
		}
	}
	
	// 1.전체 조회
	public List<Member> getMemberList() {
		List<Member> list = new ArrayList<>();
		Member member = null;
		try {
			// 1. DB 연결
			conn();
			// 2. query 작성
			String sql = "SELECT * FROM member";
			// 3. DB연결 후 조회할 수 있는 창구 생성
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
				list.add(member);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	// 2.단건 조회
	public Member getMenber(String id) {
		Member member = null;
		try {
			conn();
			String sql = "SELECT * FROM member where id = ?";
			pstmt = conn.prepareStatement(sql);
			//매개변수를 통한 데이터 조회
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPw(rs.getString("pw"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return member;
	}
	
	
	
	

	// 3. 입력
public int insertMember(Member member) {
	int result = 0;
	try {
		conn();
		String sql = "insert into member values (?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getId());
		pstmt.setString(2, member.getPw());
		pstmt.setString(3, member.getName());
		
		result = pstmt.executeUpdate();
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		disconnect();
	}
	return result;	
		
}
	
	
	
	// 4. 수정
public int updateMenber(Member member) {
	int result = 0;
	try {
		conn();
		String sql = "update member set pw = ? where id = ? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getPw());
		pstmt.setString(2, member.getId());

		result = pstmt.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		disconnect() ;
		
	}
	return result;
}



	// 5. 삭제

public int deleteMember(String id) {
	int result = 0;
	try {
		conn();
		String sql = "delete from member where id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,id);
		
		result = pstmt.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		disconnect();
	}
	return result;
}

}