package com.yedam.review;

public class CultureApp {

	public static void main(String[] args) {
		
		Culture movie = new Movie("추격자", 7,5);
		movie.setTotalScore(4);
		movie.setTotalScore(5);
		movie.setTotalScore(4);
		movie.setTotalScore(3);
		movie.setTotalScore(4);
		
		movie.getInformation();
		System.out.println("===================");
		
		
		Culture perfor = new Performance("지킬앤하이드", 9 ,10);
		
		perfor.setTotalScore(0);
		perfor.setTotalScore(0);
		perfor.setTotalScore(0);
		perfor.setTotalScore(0);
		perfor.setTotalScore(0);
		
		
		perfor.getInformation();

	}

}
