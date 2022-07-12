package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 이름, 점수 => map저장.
 * 김민수, 80/ 황현익, 75/ 이현승, 88
 * Scanner 클래스 입력 > 학생이름 입력 -> 점수 반환.
 */

public class MapExample {
	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);
		
		Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("김민수", 80);
		students.put("황현익", 75);
		students.put("이현승", 88);
		
		// 출력결과:
		// 평균점수 : 81
		// 최고점수 : 88, 최고점수 학생의 이름: 이현승.
		String name = null;
		int maxScore = 0;
		int totalScore =0;
		
		Set<Entry<String, Integer>> entryset = students.entrySet();
		
	
		for(Map.Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue() > maxScore) {
				name = entry.getValue();
				maxScore = entry.getValue();
			}
			totolScore += entry.getValue();
		}
				
		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
			
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수 받은 이름 " + name);
		
		
		
		
		
		// 학생이름으로 검색.
		System.out.println("학생이름 입력 > "  );
		String name = scn.nextLine();
		
		Set<Entry<String, Integer>> set = students.entrySet();
		
		for (Entry<String, Integer> ent : set) {
			if (ent.getKey().equals(name)) {
				System.out.println("학생의 점수: " + ent.getValue());
				
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
