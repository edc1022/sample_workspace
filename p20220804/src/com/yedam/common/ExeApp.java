package com.yedam.common;

import java.util.List;

public class ExeApp {

	public static void main(String[] args) {
		// new Management();

		new Application();

		List<Member> list = MenberManagement.getInstance().getMemberList();
		for (Member member : list) {
			System.out.println(member.toString());

		}

	}
}