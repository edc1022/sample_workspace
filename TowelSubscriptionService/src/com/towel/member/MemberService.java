package com.towel.member;

import java.util.Scanner;

import com.towel.app.ManageMent;



public class MemberService {

	public static Member memberInfo = null;
	Scanner sc = new Scanner(System.in);

	// 로그인
	public void doLogin() {
		Member member = new Member();

		System.out.println("ID>");

		String id = sc.nextLine();

		System.out.println("PW>");

		String pw = sc.nextLine();

		member = MemberManage.getInstance().loginInfo(id);

		if (member.getMemberPw().equals(pw)) {
			memberInfo = member;
		} else {
			System.out.println("로그인 실패");
		}

	}

	// 로그아웃
	public void logout() {
		if (memberInfo != null)
			memberInfo = null;
	}

	// 회원가입
	public void joinmember() {
		
		Member member = new Member();
		
		
		
		System.out.println("회원 이름>");
		String name = sc.nextLine();
		System.out.println("연락처>");
		String phone = sc.nextLine();
		System.out.println("주소>");
		String addr = sc.nextLine();
		System.out.println("회원 ID>");
		String id = sc.nextLine();
		System.out.println("회원 PW>");
		String pw = sc.nextLine();
		System.out.println("카드정보>");
		int card = Integer.parseInt(sc.nextLine());
		System.out.println("계좌정보>");
		int account = Integer.parseInt(sc.nextLine());

		member.setMemberName(name);
		member.setMemberPhone(phone);
		member.setMemberAddr(addr);
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberCard(card);
		member.setMemberAccount(account);

		int result = MemberManage.getInstance().joinember(member);

		if (result == 1) {
			System.out.println("회원 정보 등록 완료");
			new ManageMent();
		} else {
			System.out.println("회원 정보 등록 실패");
		}

	}

	// 회원정보 수정
	public void updateMember() {
		Member member = new Member();
		System.out.println("-------------------------------------------------------------");
		System.out.println("1.이름 변경 |2.연락처 변경 |3.주소 변경 |4. PW 변경 |5.카드변경 |6.계좌변경");
		System.out.println("-------------------------------------------------------------");
		int menuNo = Integer.parseInt(sc.nextLine());


		System.out.println("회원 이름 변경>");
		String memberId = sc.nextLine();

		System.out.println("연락처 변경>");
		String memberPhone = sc.nextLine();

		System.out.println("주소 변경>");
		String memberAddr = sc.nextLine();

		System.out.println("pw 변경>");
		String memberPw = sc.nextLine();

		int result = MemberManage.getInstance().updateMember(member);
		if (result == 1) {
			System.out.println("변경 완료");
		} else {
			System.out.println("변경 실패");
		}
	}

	//회원 탈퇴 -> delete
		public void deleteMember() {
			System.out.println("======회원 탈퇴======");
			
			String memberId = sc.nextLine();
			
			int result = MemberManage.getInstance().delMember(memberId);
			
			if(result == 1) {
				System.out.println("정상 탈퇴");
			}else {
				System.out.println("탈퇴되지 않음");
			}
			
		}



}
