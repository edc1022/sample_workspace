package com.yedam.common;

import java.util.List;

public class Application {
	
	public Application() {
		//실행만 하는 곳	
		 List<Member> list = MenberManagement.getInstance().getMemberList();
		 for(Member member : list) {
			 System.out.println(member.toString());
		 }
		
	}

}
