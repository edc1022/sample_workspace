package co.edc.inherit.friend;

/*
 * 학교친구.
 */
public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
		
		
		
		
	}

	@Override
	public String toString() {
		return "UnivFriend [이름: " + getName() + ", 연락처=" + getPhone() + ", " + getName() + ", getPhone()="
				+ getPhone() + "]";
	}

	



	
}
