package co.edu;

import java.util.Scanner;

public class Example05 {
	public static void main(String[] args) {
		
		String name = new String("홍길동");
		Scanner sn = new Scanner(System.in);
		
//String input = sn.nextLine();//문자열.
	//n.nextInt();// 정수.
	//ystem.out.printf("입력값은 %d", input);
		
		
		System.out.println("첫번째 값을 입력.");
		int num1 = sn.nextInt();
		
		System.out.println("두번째 값을 입력.");
		int num2 = sn.nextInt();
		
		int result = 0;
		if(num1 > num2) {
			result = num1 - num2;
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.",num1,num2,result);
		} else {
			result = num2 - num1;
			System.out.printf("입력값 %d와 %d의 차이는 %d 입니다.",num2,num1,result);
		}
		
		
	//	int result = num1 + num2 ; // 입력 2수의 합.
		
	//	System.out.printf("입력값 %d와 %d의 합은 %d 입니다.",num1, num2, result);
		// 입력값 10와 20의 합은 30 입니다.
		
	}

}
