package co.edu.loop;

public class Example02 {

	public static void main(String[] args) {

		// 3)10번 반복.
		// 1)num 변수 <= 1 ~ 10 까지의 임의 정수. Math.random();
		// 2)sum 변수 <= 2의 배수.
		// 2의 배수의 합 : ??

		int num, sum2, sum3;
		sum2 = sum3 = 0;

		for (int i = 1; i <= 10; i++) {

			num = (int) (Math.random() * 10) + 1;
			 if (num % 2 == 0) { // 2의 배수를 sum2에 누적.
				sum2 += num;
				System.out.println(num + "," + sum2);
			} 
			 if (num % 3 == 0) { //3의 배수를 sum3에 누적.
				 sum3 += num;
			 }
		}

		System.out.println("2의 배수의 합계: " + sum2);
		System.out.println("3의 배수의 합계: " + sum3);
	}

}
