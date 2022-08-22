package com.towel.deliver;

import com.towel.common.DAO;
import com.towel.member.Member;
import com.towel.product.Towel;
import com.towel.product.TowelDAO;

public class DeliverDAO extends DAO {

	private static DeliverDAO deliverlDao = null;

	private DeliverDAO() {
	}

	public static DeliverDAO getInstance() {
		if (deliverlDao == null) {
			deliverlDao = new DeliverDAO();
		}
		return deliverlDao;
	}

	// 배송 관련 신청
	public int insertDel(Deliver deliver) {
		int result = 0;
		try {
			conn();
			String sql = "insert into deliver values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, deliver.getDeliverAddr());
			pstmt.setInt(2, deliver.getDeliverTime());
			pstmt.setInt(3, deliver.getDeliverCycle());
			pstmt.setString(4, deliver.getMemberId());
			
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}

	//배송관련 수정 메소드
		public int updateDel(Deliver deliver) {
			int result = 0;
			try {
				conn();
				String sql = "update deliver set deliver_addr = ?,deliver_time = ?,"
						 +" deliver_cycle = ? where member_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, deliver.getDeliverAddr());
				pstmt.setInt(2, deliver.getDeliverTime());
				pstmt.setInt(3, deliver.getDeliverCycle());
				
				
				result = pstmt.executeUpdate();
			
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
			return result;
		}
	
		
		
		
}
