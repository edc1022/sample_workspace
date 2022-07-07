package co.deu.compound;

/*
 * 이름, 연락처, email, 생일, 키, 몸무게: 
 */
/**
 * @author admin
 *
 */
public class Friend {

	// 필드. 명명규칙(소문자, camelCase, 영문, )
	private String fullName;
	private String phone;
	private String mail;
	private String birth;
	private double height;
	private double weight;

	// 생성자: 기본생성자를 생성.
	public Friend() {

	}

	// 메소드.
	public void showInfo() {
		System.out.printf("이름은 %s, 연락처는 %s", fullName, phone);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

    public void setWeight(double weight) {
    	
    }
	// 이름, 연락처를 보여주는 showInfo()
}
	