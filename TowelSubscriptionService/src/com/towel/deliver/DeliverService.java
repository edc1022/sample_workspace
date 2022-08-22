package com.towel.deliver;

import java.util.Scanner;

import com.towel.member.Member;
import com.towel.member.MemberManage;
import com.towel.member.MemberService;
import com.towel.product.Towel;
import com.towel.product.TowelDAO;

public class DeliverService {

	public static Deliver deliverInfo = null;

	Scanner sc = new Scanner(System.in);

	private Deliver deliver;

	// 구독신청 -배송관련
	public void deliverss() {

		Deliver deliver = new Deliver();

		String memberId = MemberService.memberInfo.getMemberId();

		System.out.println("희망 배송지를 입력해주세요.");
		String addr = sc.nextLine();
		System.out.println("희망 배송 시간을 선택해주세요.");
		System.out.println("1.오전 6시 || 2.오후 6시");
		int time = Integer.parseInt(sc.nextLine());
		System.out.println("배송 주기를 선택해주세요.");
		System.out.println("1.주 1회 || 2.주 2회");
		int cycle = Integer.parseInt(sc.nextLine());

		deliver.setDeliverAddr(addr);
		deliver.setDeliverTime(time);
		deliver.setDeliverCycle(cycle);

		int result = DeliverDAO.getInstance().insertDel(deliver);

		if (result == 1) {
			System.out.println("배송 신청 완료");
		} else {
			System.out.println("배송 신청 실패");
		}

	}

	// 구독 -배송관련 정보 수정
	public void updateDeliver() {
		Deliver deliver = new Deliver();

		System.out.println("------------------------------------------");
		System.out.println("1.배송 주소 변경 |2.배송 시간 변경 |3.배송 주기 변경|");
		System.out.println("-------------------------------------------");

		int menuNo = Integer.parseInt(sc.nextLine());

		String memberId = MemberService.memberInfo.getMemberId();

		System.out.println("배송 주소 변경>");
		String deliverAddr = sc.nextLine();

		System.out.println("배송 시간 변경(1.오전 6시||2.오후 6시)");
		int deliverTime = Integer.parseInt(sc.nextLine());

		System.out.println("배송 주기 변경(1.주 1회 ||2.주 2회");
		int deliverCycle = Integer.parseInt(sc.nextLine());

		System.out.println("종료");
	

	int result = DeliverDAO.getInstance().updateDel(deliver);

	if(result==1) {
	
		System.out.println("변경 완료");
	}else	{
	
		System.out.println("변경 실패");
	}
}

}