package co.edu.reference;

import java.util.Scanner;

public class MoringEx {
		boolean run = true;
		int studentNum = 0; // 학생수 입력받을때
		int[] scores = null; // 배열은 참조변수. 참조변수에는 실제값이 아니라 주소값. 초기화!!!
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("\n1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.print("선택 >> ");

			int selectNo = Integer.parseInt(scn.nextLine()); // nextInt() => int, nextLine() =>String
			if (selectNo == 1) {
				System.out.print("학생수>>> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.println("정상적으로 처리되었습니다.");

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(scn.nextLine());

				}

			} else if (selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] >" + scores[i] + "\n");
				}
			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0;
				
				for(int i = 0; i  < scores.length; i++) {
					int max = scores[i];
					if(scores[i]>max)
						max = scores[i];
					
					System.out.print("최고 점수: " + max );
					
					
				for(int j = 0; j <= studentNum; j++) {
					int sum = 0;
					avg = 0;
					sum += scores[j];
					avg = sum / studentNum ;
					System.out.print("평균 점수: " + avg);
				}
				
					
				}
				
				

			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;

			}

		}

		System.out.println("프로그램 종료.");

	}
}
