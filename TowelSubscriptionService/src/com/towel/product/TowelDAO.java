package com.towel.product;


import com.towel.common.DAO;

public class TowelDAO extends DAO {

	private static TowelDAO towelDao = null;

	private TowelDAO() {
	}

	public static TowelDAO getInstance() {
		if (towelDao == null) {
			towelDao = new TowelDAO();
		}
		return towelDao;
	}

//타월 신청
	public int insertTowel(Towel towel) {
		int result = 0;
		try {
			conn();
			String sql = "insert into towel values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, towel.getTowelDenier());
			pstmt.setString(2, towel.getTowelOrganic());
			pstmt.setString(3, towel.getTowelColor());
			pstmt.setInt(4, towel.getTowelNum());
			pstmt.setString(5, towel.getMemberId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}

//타월 수정

	public int updateTowel(Towel towel) {
		int result = 0;
		try {
			conn();
			String sql = "update tosel set denier = ?,organic = ?,color = ?,num = ? where loan_id = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, towel.getTowelDenier());
			pstmt.setString(2, towel.getTowelOrganic());
			pstmt.setString(3, towel.getTowelColor());
			pstmt.setInt(4, towel.getTowelNum());

			result = pstmt.executeUpdate();

		} catch (Exception e) {

		} finally {
			disconnect();
		}
		return result;
	}

}
