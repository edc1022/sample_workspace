package com.yedam.review;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {

		// QUIZ

		// 로또 생성 및 관리
		// 1. 중복되지 않은 번호가 6개 출력된다.
		// 2. 한장당 총 1~5줄 생성된다.
		// 3. 한 줄당 금액은 천원이며, 입력한 금액만큼 생성한다.
		// 4. 구매 금액, 생성된 로또 번호를 출력한다.
		// 5. 5장씩 끊어서 출력할 것

		System.out.println("1.로또생성 2.로또조회 99.프로그램 종료");
		Scanner scn = new Scanner(System.in);
		System.out.println("번호입력>");
		String menu = scn.nextLine();
		System.out.println("금액을 투입해주세요");
		String money = scn.nextLine();
		System.out.println("메뉴를 선택해주세요");
		
		
		while(true) {
		int lottoNo[]= new int[6];
		for (int i=0; i < 6; i++) {
			int num = (int)(Math.random() *45 ) + 1;
			
			//첫번째 값은 중복체크 할 필요 없음.
			if (i >0) {
								//j=0, i번째까지 i = 3 (index = 0,1,2,3)
				for (int j=0; j < i; j++) {
					//40, 30, 20 <- 배열에 들어있는 값
					//20 <- randomNo
					if (lottoNo[j] == num) {
						i -= 1; //중복값이라면 넘어가지 말고 다시!!!!!
						System.out.println("중복제거!");
						break;
					}else if((j+1) ==i) {
						lottoNo[i]
					}
				}
				lottoNo[i] = num;
			}
		}
		System.out.println("번호 출력 완료");
		}
		

	}
}