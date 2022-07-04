package co.edu.loop;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		// while 반복문의 종료조건.
		// 1 ~ 100 임의의 수를 생성.
		Scanner scn = new Scanner(System.in);

		int temp = scn.nextInt();
		int inputval = (int) Math.random();
		System.out.println("임의의 값을 입력: ");
		while (true) {
			if (inputval == temp) {
				System.out.println("맞췄습니다.");

			} else if (inputval > temp) {
				System.out.println("임의의 값보다 큽니다.");
			
			} else if (inputval < temp) {
				System.out.println("임의의 값보다 작습니다.");
			} break;

		}
		System.out.println("end of prog.");

	}
}