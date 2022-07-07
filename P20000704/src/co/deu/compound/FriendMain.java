package co.deu.compound;

public class FriendMain {
	public static void main(String[] args) {
		
		// f1
		Friend f1 = new Friend();
//		f1.fullName = "김민수";
		f1.setFullName("김민수");
//		f1.phone = "010-5555-6666" ;
		f1.setPhone("010-555-6666");
//		f1.mail = "97@mail.net";
		f1.setMail("97@mail.net");
//		f1.birth = "94-02-04";
		f1.setBirth("94-02-04");
//		f1.height =172.0;
		f1.setHeight(172.0);
		System.out.println("키는 : " + f1.setHeight());
//		f1.weight =65.2;
	}

}
