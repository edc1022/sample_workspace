package com.towel.app;

import java.util.Scanner;

import com.towel.member.MemberService;

public class Application {

	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();

	public Application() {
		run();
	}

	private void run() {
		System.out.println("|1.로그인 | 2.회원가입| ");
		int menuNo = Integer.parseInt(sc.nextLine());
		while (true) {
			if (menuNo == 1) {
				ms.doLogin();

				if (MemberService.memberInfo != null) {
					new ManageMent();

				}
			} else if (menuNo == 2) {
				ms.joinmember();

			}

		}
	}
}
