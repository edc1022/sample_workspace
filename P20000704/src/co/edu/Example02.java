package co.edu;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100~90: A, ~80: B, ~70: C, 그외 : D
		// 출력값: 점수 78은 C 등급입니다!

		System.out.println("임의의 값 입력>>>>");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String grade = "";

		if (num >= 90 && num <= 100) {
			if (num >= 95) {
				grade = "A+";
			} else {

				grade = "A";
			}
		} else if (num >= 80) {
			if (num >= 85) {
				grade = "B+";
			} else {

				grade = "B";
			}
		} else if (num >= 70) {
			if (num >= 75) {
				grade = "C+";
			} else {

				grade = "C";
			}
		} else {
			grade = "D";
		} if (num >=65) {
			grade = "D+";
		}
		System.out.println("점수 " + num + "은 " + grade + "등급 입니다.");

	}

}
