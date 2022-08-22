package com.towel.app;

import java.util.Scanner;

import com.towel.deliver.DeliverService;
import com.towel.member.MemberService;
import com.towel.pay.PayService;
import com.towel.product.TowelService;

public class ManageMent {

	Scanner sc = new Scanner(System.in);

	MemberService ms = new MemberService();
	TowelService ts = new TowelService(); 
	DeliverService ds = new DeliverService();
	PayService ps = new PayService();
	
	int menuNo = 0;

	public ManageMent() {
		menuInfo();
	}

	private void menuInfo() {
		
		while(true) {
			System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
			System.out.println("| 1.구독신청 | 2.구독조회 | 3.구독정보 변경| 4.회원정보 수정| 5.탈퇴 | 6.종료 |");
			System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
			
			int menuNo = Integer.parseInt(sc.nextLine());
				if(menuNo == 1) {
					ts.towelss();
					ds.deliverss();
					ps.payss();
				
				}else if(menuNo == 2) {
					
					
				}else if(menuNo == 3) {
					ms.updateMember();
				    ds.updateDeliver();
					ps.updatePay();
				
				}else if(menuNo == 4) {
					ms.updateMember();
				
				}else if(menuNo == 5) {
					ms.deleteMember();
				
				}else if(menuNo == 6) {
					System.out.println("종료되었습니다.");
				}
			
			}
		}

}
