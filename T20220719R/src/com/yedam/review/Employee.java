package com.yedam.review;

public class Employee {

//	1) Employee 클래스를 정의한다.
//- 이름과 연봉을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	
//- 각 필드의 getter만 존재한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름과 연봉을 출력하는 기능
//(2) public void print() : "수퍼클래스"란 문구를 출력하는 기능
//	

	//필드
	protected String name;
	protected int salary;
	
	//생성자 - 오버로딩은 생성자를 위해서 많이 쓴다. 이름은 같아도 매개변수가 다르면 여러개 메소드 선언 가능.
	//public Employee() {}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	} //생성자를 이용하여 값을 초기화함

	
	
	//메소드
	public String getName() {
		return name;
	}

	

	public int getSalary() {
		return salary;
	}

	
	
	public void getInformation() {
		System.out.println("이름 : " + name + "연봉 : " + salary);
	}

	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
}
