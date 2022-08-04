package com.yedam.common;

import java.util.ArrayList;
import java.util.List;


public class MenberManagement extends DAO {
	
	//싱글톤 생성
	private static MenberManagement mm = null;
	
	//private 생성자 생성
	private  MenberManagement () {
		
	}
//단 하나의 객체를 사용할 수 있도록 메소드 생성
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

	// 3. 입력

	// 4. 수정

	// 5. 삭제

}
