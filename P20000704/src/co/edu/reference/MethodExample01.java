package co.edu.reference;

public class MethodExample01 {

	public static void main(String[] args) {
		// 실행구문.
		// long sum = sum(10.3);//arguments(매개값)
		// showInfo("홍길동",20);
		// showInfo("백나현",25);
		// printstar(4,"♥");
		for (int i =2; i<=9; i++) {
			
			printGugudan(i);
		}
	}

	public static void printGugudan(int dan) {
		for(int i=1; i<=9;i++) {
				//System.out.println("2 * " + i + "=" + (2 * i));
				System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
				
			
		}
		System.out.println();
	
//♥
//♥♥
//♥♥♥		
//♥♥♥♥



	//public static void printstar(int times, String shape) {
		// for(int i=1; i<=times;i++) {
		//System.out.print(shape);

		//for (int i = 1; i <= times; i++) {
		//	for (int j = 1; j <= i; j++) {
			//	System.out.println(shape);
		//	}
		//	System.out.println();
		}

	//}

	//}

	//public static void showInfo(String name, int age) {
		//System.out.println("반갑습니다." + name + "입니다.나이는 " + age + "살 입니다.");
	//}

	// 정의구문.
	public static long sum(int num) { // parameter(매개변수)
		int result = num * 2;
		return (long) result; // 자동형변환(promotion)

	}
}
