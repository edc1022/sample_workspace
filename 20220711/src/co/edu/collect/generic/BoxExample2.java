package co.edu.collect.generic;

/*
 * 제네릭 : 타입을 클래스 정의하는 시점이 아니라 사용하는 시점에 지정.
 */
public class BoxExample2 {
	public static void main(String[] args) {

		Box<String> box = new Box<String> ();
		box.set("문자열");
		String result = (String) box.get();
//		Integer result1 = box.get(); // String -> Integer

		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer (boxing)
		int result1 = (int) intBox.get(); //Integer => int (unboxing)
		
		
		
	}

}
