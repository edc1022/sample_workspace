package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 10; // -128 < byte < 127
		short s1 = 32767; // -32768 < short < 32767
		int n1 = 0; // -2147483648 > int > 2147483647
		long l1 = 8;
		
		byte result = 10 + 20; // (int) b1 + 20;
		
		System.out.println(result);
		
		char c1 = 'A';
	//	c1++;
	//	for (int i = 0; i < 25; i++) {

		System.out.println((int) c1++);
		System.out.println(c1++);
		
		
	//  이력변경추가 2022.07.01.12:55
		System.out.println("이력변경추가.");
	//	}
	}
}
