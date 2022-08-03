package com.yedam.review;

import java.util.Scanner;

public class Review1 {
	// 과제 1 추가문제

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int val = 373;

		int val2 = 373 / 100; // 3

		int val3 = (373 - (val2 * 100)) / 10;
		// 1. val2*100 = 3*100
		// 2. 373-vak2*100 = 373 -300
		// 3. 73 / 10 = 7

		int vla4 = (373 - (val2 * 100) - (val3 * 10));
		// 1.val2*100 = 3*100
		// 2. 373 - val2*100 = 373 -300
		// 3. 73 - val3*10(70) = 3

		// 문제4) 변수 val의 값이 양수일 경우엔 변수 값을, 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)

		int var = -2;
		int var2 = var > 0 ? var : 0;

		if (var > 0) {
			System.out.println(var);
		} else {

			System.out.println(0);
		}

//		public int exam() {
//			return var>0 ? var : 0;
//		}

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.

		for (int i = 0; i <= arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println((i + 1) + "번째 위치입니다.");
				break;
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (i != 3) {
				System.out.println(arr1[i]);
			}
		}

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}

		System.out.println("인덱스 입력>");
		int index = Integer.parseInt(sc.nextLine());
		arr1[index] = 1000;

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		// {10, 20, 30, 1000, 3, 60, -3}

		int max = 0; // arr1[0] -3 배열의 첫번째 값 넣어줘서 비교할수있게해주면 마이너스까지 ok
		int min = 0; // arr1[0]
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
			if (arr1[i] < min) {
				min = arr1[i];
			}

		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		
		// 클래스 타입 배열 - 과제 상품수 상품가격 문제
		
	
		Product[] pro = null;
		pro = new Product [10];
		pro[0] = new Product();
		
		
		
		Product pro1 = new Product();
		pro[1] = pro1;
		
		
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
				// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
				
				// 1.Product Class -> 배열 -> 배열에 있는 데이터를 비교, 연산 -> 프로그램 만들어보자
				// 2.Product -> price, amount
				// 3.Product[] proArr;
				// 4.각 인덱스 호출 최고 가격 제품 골라내기, 모든 제품 합 - 최고 가격
				// 5.코딩
				
				// 1) 메뉴는 다음과 같이 구성하세요.
				// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
				// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
				// 3) 제품별 가격을 출력하세요.
				//	출력예시, "상품명 : 가격"
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		
		
	}

}
