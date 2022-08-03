package com.yedam.review;

public class ObesityInfo extends StandardWeightInfo {
	
//	3) ObesityInfo 클래스를 정의한다.
//- StandardWeightInfo 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
//	
	
	//필드
	
	//생성자
	public ObesityInfo (String name, double tall, double weight) {
		super(name,tall,weight);
	}

	
	//메소드
	@Override
	public void getInformation() {
		
		System.out.println("이름 : " + name + "키 : " + tall + "몸무게 : "+ weight +"비만도" +  getObesity(weight,tall));
	}

	@Override
	public double getObesity(double weight,double tall) {
		
		return (weight- super.getStandardWeightInfo(tall))/super.getStandardWeightInfo(tall) * 100;
	}

	
	
	
	
	
	

}
