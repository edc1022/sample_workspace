package co.edu.collect.board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {

//		System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
		// 메뉴 선택 => 선택값 => 구현
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			System.out.println("메뉴 번호를 선택 >> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			String title = "";

			if (selectNo == 1) {
				System.out.println("목록보기 >> ");
				BoardDAO j = BoardDAO.getInstance();
				List<Board> list = j.boardList();

				for (Board brd : list) {
					System.out.println(brd.toString());

				}

			} else if (selectNo == 2) {
				System.out.println("제목을 입력하세요 >> ");
				String title1 = scn.nextLine();
				System.out.println("글을 입력하세요 >> ");
				String title2 = scn.nextLine();
				System.out.println("작성자를 입력하세요 >> ");
				String title3 = scn.nextLine();
				Board board = new Board(title1, title2, title3);
				BoardDAO h = BoardDAO.getInstance();
				h.add(board);
				
			} else if (selectNo == 3) {
				System.out.println("조회할 작성자 이름을 입력하세요 >> ");
				
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료합니다.");
				break;
				
			}
				

		}
		System.out.println("프로그램 종료합니다.");
	}

}
