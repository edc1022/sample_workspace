package com.yedam.exam;

import com.yedam.exam.Payment;

public class CarePayment implements Payment {

//	(2) CardPayment 클래스
//	  - 1.필드로 카드할인율(cardRatio)을 가진다.
//	  - 2.생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다.
//	  - 아래의 실행코드와 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.

	
	//필드
	public double cardRatio;
	
	//생성자
	public CarePayment(double cardRatio) {
		this.cardRatio = cardRatio;  //생성자 통한 데이터 초기화
	}
	
	//메소드
	
	@Override
	public int online(int price) {
		
		return 0;
	}

	@Override
	public int offline(int price) {
		
		return 0;
	}

	@Override
	public void showInfo() {
		
	}

}
