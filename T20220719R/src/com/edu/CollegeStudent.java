package com.edu;

public class CollegeStudent extends Student {
//	대학생정보 : 담당교수, 전공과목 정보 추가.

	private String pro;
	private String major;
	
	
	
	// 생성자.


public CollegeStudent(String pro,String major) {
	super();
	this.pro = pro;
	this.major = major;
	
}
	
public CollegeStudent() {
	
}

public String getPro() {
	return pro;
}

public void setPro(String pro) {
	this.pro = pro;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

// toString()
@Override
public String toString() {
	return "CollegeStudent [studNo=" + getStudNo() + ", studName=\" + getStudName() + ", score=\" + getScore() + " pro=" + pro + ", major=" + major + "]";
}
	
	


}
