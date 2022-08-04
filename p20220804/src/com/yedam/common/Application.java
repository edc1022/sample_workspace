package com.yedam.common;

import java.util.List;
import java.util.Scanner;

public class Application {

	Scanner sc = new Scanner(System.in);

	public Application() {
		// 실행만 하는 곳

		run();
	}

	private void run() {
		boolean flag = true;
		while (flag) {

			System.out.println("1. 전체 조회 2. 단건 조회 3. 회원 입력 4. 회원 수정" + "5. 회원 삭제 6. 종료");

			System.out.println("입력>");

			int menuNo = Integer.parseInt(sc.nextLine());
			switch (menuNo) {
			case 1:
				List<Member> list = MenberManagement.getInstance().getMemberList();
				if (list.size() == 0) {
					System.out.println("데이터가 한 건도 없습니다.");
				} else {
					for (Member member : list) {
						System.out.println(member.toString());
					}
				}
				break;
			case 2:
				System.out.println("조회할 ID 입력>");
				String id = sc.nextLine();
				Member member = MenberManagement.getInstance().getMenber(id);
				if (member == null) {
					System.out.println("등록되지 않은 ID 입니다.");
				} else {
					System.out.println(member.toString());

				}
				break;
			// 입력
			case 3:
				Member member2 = new Member();
				System.out.println("===회원 등록===");
				System.out.println("ID>");

				String str = sc.nextLine();
				member2.setId(str);

				System.out.println("PW>");

				String str2 = sc.nextLine();
				member2.setId(str2);

				System.out.println("이름>");

				String str3 = sc.nextLine();
				member2.setId(str3);

				int result = MenberManagement.getInstance().insertMember(member2);
				if (result == 1) {
					System.out.println("정상 입력");

				} else {

					System.out.println("입력 실패");
				}
				break;
			// 수정

			case 4:
				Member member3 = new Member();
				System.out.println("===회원 수정 ===");

				System.out.println("수정 ID>");
				String str4 = sc.nextLine();
				member3.setId(str4);

				System.out.println("수정 PW>");
				String str5 = sc.nextLine();
				member3.setPw(str5);

				int result2 = MenberManagement.getInstance().updateMenber(member3);
				if (result2 == 1) {
					System.out.println("정상 입력");

				} else {

					System.out.println("입력 실패");
				}
				break;
			// 삭제
			case 5:

				System.out.println("=== 회원 삭제 ===");

				System.out.println("삭제 ID>");
				String str6 = sc.nextLine();

				int result3 = MenberManagement.getInstance().deleteMember(str6);
				if (result3 == 1) {
					System.out.println("정상 삭제");

				} else {

					System.out.println("삭제 실패");
				}

				break;
			case 6:
				System.out.println("end of prog");
				flag = false;
				break;

			}

		}
	}
}