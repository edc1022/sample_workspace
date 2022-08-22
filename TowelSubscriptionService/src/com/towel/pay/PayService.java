package com.towel.pay;

import java.util.List;
import java.util.Scanner;



import com.towel.member.MemberService;

public class PayService {

	public static Pay payInfo = null;
	Scanner sc = new Scanner(System.in);

	// 구독신청 -배송관련
	public void payss() {

		Pay pay = new Pay();

		System.out.println("결제일을 선택해주세요.");
		System.out.println("1.5일 | 2.15일 | 3.25일");
		int day = Integer.parseInt(sc.nextLine());
		System.out.println("구독주기를 선택해주세요.");
		System.out.println("1. 1개월 |2. 3개월 |3. 6개월 |4. 1년");
		int subcycle = Integer.parseInt(sc.nextLine());
		System.out.println("결제수단을 선택해주세요.");
		System.out.println("1.카드 자동이체 || 2.계좌 자동이체");
		int method = Integer.parseInt(sc.nextLine());

		String memberId = MemberService.memberInfo.getMemberId();

		pay.setPayDay(day);
		pay.setPaySubcycle(subcycle);
		pay.setPayMethod(method);

		int result = PayDAO.getInstance().insertPay(pay);

		if (result == 1) {
			System.out.println("신청 완료");
			 PayInfo();
		} else {
			System.out.println("신청 실패");
		}

	}

//구독 -결제 관련 수정

	public void updatePay() {

		Pay pay = new Pay();
		
			System.out.println("----------------------------------------------");
			System.out.println("|1.결제일 변경 |2.구독 주기 변경 |3.결제수단 변경 |4.종료|");
			System.out.println("----------------------------------------------");

			int menuNo = Integer.parseInt(sc.nextLine());

			String memberId = MemberService.memberInfo.getMemberId();

			
				System.out.println("결제일 변경>");
				System.out.println("1.5일 | 2.15일 | 3.25일");
				String payDay = sc.nextLine();

			
				System.out.println("구독 주기 변경>");
				System.out.println("1. 1개월 |2. 3개월 |3. 6개월 |4. 1년");
				String paySubcylce = sc.nextLine();

			
				System.out.println("결제수단 변경>");
				System.out.println("1.카드 자동이체 || 2.계좌 자동이체");
				String payMethod = sc.nextLine();

			
				System.out.println("종료>");
			

			int result = PayDAO.getInstance().updatePay(pay);
			
			if (result == 1) {
				System.out.println("변경 완료");
			} else {
				System.out.println("변경 실패");
			}
		}
	

//구독 조회

	

		public void PayInfo() {

			List<Pay> list = PayDAO.getInstance().getPayList(MemberService.memberInfo.getMemberId());
			System.out.print(MemberService.memberInfo.getMemberId() + " 님의 구독 정보");
			for (Pay pay : list) {
				System.out.println("회원 ID> " + pay.getMemberId());
				System.out.println("타월 Denier> " + pay.getTowelDenier());
				System.out.println("타월 Organic> " + pay.getTowelOrganic());
				System.out.println("타월 색깔> " + pay.getTowelColor());
				System.out.println("타월 갯수> " + pay.getTowelNum());
				System.out.println("희망 배송지> " + pay.getDeliverAddr());
				System.out.println("희망 배송시간> " + pay.getDeliverTime());
				System.out.println("배송주기> " + pay.getDeliverCycle());
				System.out.println("결제일> " + pay.getPayDay());
				System.out.println("구독 주기> " + pay.getPaySubcycle());
				System.out.println("결제수단> " + pay.getPayMethod());

			
			
			
			
			}
		}



}
