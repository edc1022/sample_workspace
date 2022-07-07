package co.deu.compound;

import java.util.Date;
import java.util.Scanner;

/*
 * 등록/ 조회/ 수정/ 삭제/ 리스트
 *id:user1, passwd: 1212 =>로그인 되었습니다!!
 *						 =>아이디, 비번을 확인하세요!!
*/
public class BoardApp {
	public static void main(String[] args) {
		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);

		// 로그인 처리 기능.
		while (true) {
			System.out.println("아이디를 입력하세요");
			String id = scn.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String pw = scn.nextLine();

			if (id.equals("user1") && pw.equals("1212")) {
				System.out.println("로그인 되었습니다.");
				break;
			}
			System.out.println("로그인 실패했습니다.");
		}

	boolean run = true;

	


	while(run)
	{
		System.out.println("1.등록 2.조회 3.수정 4.삭제 5.리스트 6.종료");
		System.out.print("선택> ");

		int selectNo = Integer.parseInt(scn.nextLine());

		if (selectNo == 1) {
			// 게시글 등록 (제목, 내용, 작성자, 작성일시, 조회수(0));
			System.out.println("글제목을 입력하세요.");
			String title = scn.nextLine();

			System.out.println("글내용을 입력하세요.");
			String content = scn.nextLine();

			System.out.println("글작성자를 입력하세요.");
			String writer = scn.nextLine();

			Board board = new Board();
			board.setTitle(title);
			board.setContent(content);
			board.setWriter(writer);
			board.setCreateDate(new Date());
			board.setHitCount(0);

			System.out.println();
			// 배열의 비어있는 위치에 저장.
			for (int i = 0; i < boards.length; i++) {
				if (boards[i] == null) {
					boards[i] = board; // 비어있는 위치에 한건 저장.
					break;
				}
			}

		} else if (selectNo == 2) {
			// 게시글 조회: 제목조회.
			System.out.println("조회할 제목을 입력하세요.>");
			String findTitle = scn.nextLine();
			for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {
					System.out.printf("제목은 %s, 내용을 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n", boards[i].getTitle(),
							boards[i].getContent(), //
							boards[i].getWriter(), boards[i].getCreateDate(), boards[i].getHitCount());

					// 카운트 증가.
					int cnt = boards[i].getHitCount();
					boards[i].setHitCount(++cnt);

				}
			}

		} else if (selectNo == 3) {
			// 제목 찾아서 내용 수정하기

			System.out.println("수정할 제목을 입력하세요.>");
			String findTitle = scn.nextLine();

			for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {

				}

			}

		} else if (selectNo == 4) {
			System.out.println("삭제할 제목을 입력하세요.>");
			String findTitle = scn.nextLine();
			for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i].getTitle().equals(findTitle)) {

					// 삭제.
					boards[i] = null;
					System.out.println("존재하지 않습니다.");
				}
			}
		} else if (selectNo == 5) {
//				전체리스트.
			for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null) {
					System.out.printf("제목은 %s, 내용을 %s, 작성자는 %s, 작성일시 %s, 조회수 %d \n", boards[i].getTitle(),
							boards[i].getContent(), //
							boards[i].getWriter(), boards[i].getCreateDate(), boards[i].getHitCount());

				}
			}
		} else if (selectNo == 6) {

			System.out.println("프로그램을 종료합니다...");
			run = false;
		}

	}System.out.println("프로그램 종료.");

}}
