package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	
//		//싱글톤 패턴 - 사용하는 이유 : 단 하나의 객체를 보장. static 메모리에 한번 올라가서 어느 지역에서든 끝날때까지 호출해서 사용
	//	
//		//1.자기자신으로 만든 인스턴스
//		private static DAO dao = null; // 계속 호출되면 그때마다 메모리에 올라가게됨. 메모리 손실막음
//		//2.생성자
//		private DAO() { //무분별한 객체 생성을 막음
//			
//		}
	//	
//		//3. 1번에서 만든 인스턴스 사용
//		public static DAO getInstance() { //getInstance 사용해서 공유가능
//			if(dao == null) {
//				return new DAO();
//			}else {
//				return new DAO();
//			}
//				
//		}
		//DAO
		//Data access Object
		
		//java <-> DB 연결할때 쓰는 객체
		protected Connection conn = null;
		//Select(조회) 결과 값 반환 받는 객체
		protected ResultSet rs = null;
		//Query문을 담고 Query문 실행하는 객체
		protected PreparedStatement pstmt = null;
		//Query문을 담고 Query문 실행하는 객체
		protected Statement stmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	    String id = "test";
	    String pw = "1234";
	    
	    public void conn() {
	    	try {
	    		//1. 드라이버 로딩
				Class.forName(driver);
				//2.DB 연결
				conn = DriverManager.getConnection(url,id,pw);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
	    }

	  public void disconnect() {
		  try {
			  if(rs != null) {
				  rs.close();
			  }
			  if(stmt != null) {
				  stmt.close();
			  }
			  if(pstmt != null) {
				  pstmt.close();
			  }
			  if(conn != null) {
				  conn.close();
			  }
			  
		  }catch (Exception e) {
			  e.printStackTrace();
		  }
		  
	  }
		

	}



