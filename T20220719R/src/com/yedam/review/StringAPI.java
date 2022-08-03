package com.yedam.review;

public class StringAPI {

	public static void main(String[] args) {
		
		String a = "aaa"; // a와 b는 주소값 같음 100번지
		
		String b = "aaa";
		
		String c = new String("aaa"); //new 연산자로 객체 생성 주소값 다름
		
		if ( a==c) //주소값 비교
			
		if ( a.equals(c)) // 안에있는 데이터 (문자값) 비교	
			
		
			//"aaabbb" 101번지	
		a = a + "bbb";	
			
			
			StringBuilder sb = new StringBuilder();
		
		//100번지
		sb.append("aaa");
		//111번지
		sb.append("bb");
		
		
		//6자리 - 7자리 -> Scanner 데이터 (000000-1234567)
					
		
		
		
		
		
		
	}
}
