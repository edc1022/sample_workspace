package co.edu;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("임의 숫자 입력>> ");
		int num1 = scn.nextInt();
		
		boolean is3Times = num1 % 3 == 0;
		if (!is3Times) {
			System.out.printf("입력값 %d은 3의 배수입니다.", num1);
			} else {
				System.out.println();
				}
		
		// 3의 배수=> 입력6은 3의 배수입니다.
	}

}
