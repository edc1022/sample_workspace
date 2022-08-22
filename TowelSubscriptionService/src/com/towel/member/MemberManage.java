package com.towel.member;


import com.towel.common.DAO;

//member 관련 sql 작성
public class MemberManage extends DAO {

	// 싱글톤 : 단 하나의 객체
	private static MemberManage mm = null;

	private MemberManage() {
	}

	public static MemberManage getInstance() {
		if (mm == null) {
			mm = new MemberManage();
		}
		return mm;
	}

	// 로그인 메소드
	public Member loginInfo(String id) {

		Member member = null;

		try {
			conn();

			String sql = "select * from member where member_id=? ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				
				member = new Member();
				member.setMemberId(rs.getString("member_id"));
				member.setMemberName(rs.getString("member_name"));
				member.setMemberPw(rs.getString("member_pw"));
				member.setMemberAddr(rs.getString("member_addr"));
				member.setMemberPhone(rs.getString("member_phone"));
				member.setMemberCard(rs.getInt("member_card"));
				member.setMemberAccount(rs.getInt("member_account"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return member;
	}

	//회원 가입 메소드
	public int joinember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member (member_name, member_phone,"
					+"  member_addr, member_id, member_pw, member_card, member_account) values (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberName());
			pstmt.setString(2, member.getMemberPhone());
			pstmt.setString(3, member.getMemberAddr());
			pstmt.setString(4, member.getMemberId());
			pstmt.setString(5, member.getMemberPw());
			pstmt.setInt(6, member.getMemberCard());
			pstmt.setInt(7, member.getMemberAccount());
			
			result = pstmt.executeUpdate();
					
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	

	//회원정보 수정 메소드
	public int updateMember(Member member) {
		int result = 0;
		try {
			conn();
			String sql = "update member set member_name = ?,member_phone = ?,"
					 +" member_addr = ?, member_pw = ? where member_id = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberName());
			pstmt.setString(2, member.getMemberPhone());
			pstmt.setString(3, member.getMemberAddr());
			pstmt.setString(4, member.getMemberId());
			
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}

	
	//회원 탈퇴
		public int delMember(String memberId) {
			int result = 0;
			try {
				conn();
				String sql = "delete from member where member_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, memberId);
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			return result;
		}
	
	
	
}





