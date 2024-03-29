package com.yedam.review;

public class EmpDept extends Employee {
	
//	2) EmpDept 클래스를 정의한다.
//- Employee 클래스를 상속한다.
//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 추가된 필드의 getter를 정의한다.
//- Employee 클래스의 메소드를 오버라이딩한다.
//(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
//(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
//
//	
	
	
	//필드
	private String deptName;
	
	
	//생성자
	public EmpDept(String name, int salary, String deptName) {
		super(name, salary); //자식 객체 만들때 부모클래스 객체도 만들어줘야함
		this.deptName = deptName; //자식클래스 필드 생성자를 통한 초기화해줌
		
		
	}

	//메소드
	public String getDeptName() {
		return deptName;
	}

	@Override
	public void getInformation() {
		
		System.out.println("이름 :" + name + " 연봉 : " + salary + " 부서 : " + deptName);
	}

	@Override
	public void print() {
		super.print(); // 부모클래스에 있는 print 메서드 내용을 출력해준다
		System.out.println("서브클래스");
		
		
	}


	
	
	
	
	
	
}
