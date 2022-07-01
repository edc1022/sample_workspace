package co.edu;

public class Example01 {
	public static void main(String[] args) {
		int result = 50 + 50;
		String text = " 나는 할 수 있다.";
	System.out.println(result + text);
 

		
 // float, double : double default.
float f1 = 23.4f;
System.out.println(Float.MIN_VALUE);
System.out.println(Float.MAX_VALUE);
double d1 = 23.4;

System.out.println(result);



double myHeight = 162.5;
double frindHeight = 159.4;

double theDifference = 0;

if (myHeight > frindHeight) {
	// 나의 키가 더 큽니다
	theDifference = myHeight - frindHeight;
	System.out.println("나의 키가 " + theDifference + "만큼 더 큽니다.");
} else {
	// 나의 키가 더 작습니다.
	theDifference = frindHeight - myHeight;
	System.out.println("나의 키가 " + theDifference + "더 작습니다.");
}
	}
}





