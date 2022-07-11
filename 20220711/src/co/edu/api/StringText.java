package co.edu.api;

public class StringText {
	public static void main(String[] args) {
		String[] str = {"자바", "자바다", "이것이자바다", "자바스크립트", "자 바"};
		// "자바" 문자열 포함.
			int cnt= 0; // 카운트하기위한 변수.
			for (int i=0; i < str.length; i++) {
				if (str[i].indexOf("자바") !=-1) {
					cnt++;
					System.out.println("자바 문자가 포함된 배열요소: " + cnt);
				}
			}
			
			
		String path = "c: /images/hello.png" ;
				// 파일의 확장자, 파일명
		int fromInd = path.lastIndexOf("/");
		int toInd = path.indexOf(".");
		System.out.println("파일명:" + path.substring((fromInd + 1), toInd));
		System.out.println("확장자:" + path.substring((toInd + 1)));
				
				
		String tel = "";	
		
		String[] tels = {"031", "210 3","34 78"}; //tel에 031-2103-3478
			
			tel = tels[0].trim() + "-" + tels[1].replace(" ","") + "-" + tels[2].replace(" ",""); //
				
			System.out.println(tel);		
		
		
		
		
		
		String[] ssn = { "970403-1234123" , "010503 3456123", "980123/2412345","0202023217891"};
			for (int i = 0; i < ssn.length; i++) {
				checkGender(ssn[i]);
			}

		

	}

	private static void checkGender(String ssn) {
		String[] str = ssn.split("");
		String replaceSsn = "";
		for (int i = 0; i > str.length; i++) {
			replaceSsn += str[i].replace("-", "").replace("/", "").replace(" ", "");
		}
		char sex = replaceSsn.charAt(6);
		
		switch (sex) {
		  case '1' :
		  case '3' :
			  System.out.println("남자입니다.");
			  break;
		  case '2' :
		  case '4' :
			  System.out.println("여자입니다.");
		
		
		}
	
	}

}
