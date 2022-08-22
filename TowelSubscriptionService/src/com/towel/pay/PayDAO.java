package com.towel.pay;

import java.util.ArrayList;
import java.util.List;

import com.towel.common.DAO;
import com.towel.product.Towel;

public class PayDAO extends DAO {

	private static PayDAO payDao = null;

	private PayDAO() {
	}

	public static PayDAO getInstance() {
		if (payDao == null) {
			payDao = new PayDAO();
		}
		return payDao;
	}

//구독 -결제 관련 신청
	public int insertPay(Pay pay) {
		int result = 0;
		try {
			conn();
			String sql = "insert into pay values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, pay.getPayDay());
			pstmt.setInt(2, pay.getPaySubcycle());
			pstmt.setInt(3, pay.getPayMethod());
			pstmt.setString(4, pay.getMemberId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 구독 -결제 관련 수정

	public int updatePay(Pay pay) {
		int result = 0;
		try {
			conn();
			String sql = "update pay set pay_day = ?," + " pay_subcycle = ?, pay_method = ? where pay_id = ? ";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, pay.getPayDay());
			pstmt.setInt(2, pay.getPaySubcycle());
			pstmt.setInt(3, pay.getPayMethod());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 구독 조회
	public List<Pay> getPayList(String memberId) {
		List<Pay> list = new ArrayList<>();
		Pay pay = null;
		try {
			conn();
			String sql = "select d.member_id,d.deliver_addr, d.deliver_time, d.deliver_cycle,"
					+ "p.pay_day,p.pay_subcycle,p.pay_method,t.towel_denier,t.towel_organic,t.towel_color,t.towel_num\r\n"
					+ "from deliver d join pay p \r\n" + "on (d.member_id = p.member_id)\r\n" + "join towel t\r\n"
					+ "on (d.member_id = t.member_id)\r\n" + "where d.member_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				pay = new Pay();
				pay.setMemberId(rs.getString("member_id"));
				pay.setPayDay(rs.getInt("pay_day"));
				pay.setPaySubcycle(rs.getInt("pay_subcycle"));
				pay.setPayMethod(rs.getInt("pay_method"));
				pay.setDeliverAddr(("deliver_addr"));
				pay.setDeliverTime(rs.getInt("deliver_time"));
				pay.setDeliverCycle(rs.getInt("deliver_cycle"));
				pay.setTowelDenier(rs.getInt("towel_denier"));
				pay.setTowelOrganic(rs.getString("towel_organic"));
				pay.setTowelColor(rs.getString("towel_color"));
				pay.setTowelNum(rs.getInt("towel_num"));

				list.add(pay);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}
