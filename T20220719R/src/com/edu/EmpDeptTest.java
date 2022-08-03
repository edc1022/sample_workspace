package com.edu;

public class EmpDeptTest {
	
	
	class Employee {
		String name;
		int salary;

		Employee() {
		}

		Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		public void getInformation() {
			System.out.println("이름: " + name + ", 연봉: " + salary);
		}

		public void print() {
			System.out.println("수퍼클래스");
		}
//		1) Employee 클래스를 정의한다.
	//- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	//- 각 필드의 getter만 존재한다.
	//- 메소드는 다음과 같이 정의한다.
	//(1) public void getInformation() : 이름과 연봉을 출력하는 기능
	//(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
	}

	public class EmpDept extends Employee {

		String depName;

		EmpDept(String name, int salary, String depName) {
			super();
			this.name = name;
			this.salary = salary;
			this.depName = depName;
		}

		public String getDepName() {
			return depName;
		}

		@Override
		public void  getInformation() {

			super. getInformation("이름: " + name + ", 연봉: " + salary + ", 부서: " + depName);
		}

		@Override
		public void print() {

			super.print("수퍼클래스\n서브클래스");
		}

	}

	//2) EmpDept 클래스를 정의한다.
	//- Employee 클래스를 상속한다.
	//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	//- 추가된 필드의 getter를 정의한다.
	//- Employee 클래스의 메소드를 오버라이딩한다.
	//(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
	//(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능

	class EmpDeptTest {
		public static void main(String[] args) {

			EmpDept e = new EmpDept("이지나",3000,"교육부");
			
		}

	}

	//3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
	//- 출력결과
	//이름:이지나  연봉:3000  부서:교육부
	//수퍼클래스
	//서브클래스

	
	

}
