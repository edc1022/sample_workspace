package co.edu.collect;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("홍길동");
		
		stack.push("김인수");
		
		stack.push("박찬호");
		
		String elem = stack.pop(); // 가장 마지막에 위치한 요소를 빼냄
		System.out.println(elem);
		
		elem =stack.peek(); // 빼내지는 않고 마지막 요소 출력만함
		System.out.println(elem);
		
		
		elem =stack.pop(); // 빼내고 나면 다음거 빼냄
		System.out.println(elem);
		
		if (stack.isEmpty()) { // 다 빼내서 비어있는 상태
			System.out.println("스택에 더 요소가 없음.");
		}
		
		
	}

}
