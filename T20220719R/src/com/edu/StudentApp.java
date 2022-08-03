package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {
			System.out.println("1.등록 2.종료");
			System.out.println("메뉴 번호를 선택 >> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			

			if (selectNo == 1) {
				System.out.println("1.고등학생 | 2.대학생 ");
				int choice = Integer.parseInt(scn.nextLine());
				System.out.println("학생이름을 입력하세요 >> ");
				String title1 = scn.nextLine();
				System.out.println("학생번호를 입력하세요 >> ");
				String title2 = scn.nextLine();
				System.out.println("점수를 입력하세요 >> ");
				String title3 = scn.nextLine();
					if(choice == 1) {
						System.out.println("학년을 입력하세요 >> ");
						String title4 = scn.nextLine();
						System.out.println("담임 선생님 이름을 입력하세요 >> ");
						String title5 = scn.nextLine();
					} else if(choice == 2){
						System.out.println("전공과목을 입력하세요 >> ");
						String title6 = scn.nextLine();
						System.out.println("담당 교수님 이름을 입력하세요 >> ");
						String title7 = scn.nextLine();
						
					} else {
						System.out.println("잘못입력하셨습니다.");
					}
			
			} else if (selectNo == 2) {
				System.out.println("프로그램 종료합니다.");
				break;

			}

			System.out.println("프로그램 종료합니다.");
		}
	}
}
