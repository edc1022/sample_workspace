package com.towel.product;

import java.util.Scanner;

import com.towel.member.Member;

public class TowelService {

	public static Towel towelInfo = null;

	Scanner sc = new Scanner(System.in);

	
	// 타월 신청
	public void towelss() {

		Towel towel = new Towel();
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("20수,30수,40수는 원단(면)의 두께를 뜻하는 것이 아니라 실의 굵기를 뜻합니다.");
		System.out.println("수가 커질수록 실의 길이는 길어지고 실의 굵기도 얇아 부드럽습니다.");
		System.out.println("★★20수:미용실, 목욕탕 타월로 많이 쓰임.");
		System.out.println("★★★30수:일반적으로 가정에서 많이 사용함.");
		System.out.println("★★★★40수:고급타월. 일명 호텔 수건");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");

		System.out.println("20수, 30수, 40수 중 선택하세요!!!");
		System.out.println("Denier 선택>");
		int denier = Integer.parseInt(sc.nextLine());
		System.out.println("오가닉 선택 (YES or NO)");
		String organic = sc.nextLine();
		System.out.println("색깔 선택 (gray or white)");
		String color = sc.nextLine();
		System.out.println("수량 선택>");
		int num = Integer.parseInt(sc.nextLine());
		
		towel.setTowelDenier(denier);
		towel.setTowelOrganic(organic);
		towel.setTowelColor(color);
		towel.setTowelNum(num);


		int result = TowelDAO.getInstance().insertTowel(towel);

		if (result == 1) {
			System.out.println("타월 신청 완료");
		} else {
			System.out.println("타원 신청 실패");
		}

	}

}
