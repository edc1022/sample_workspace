package co.edu;

public class StudentMain {

	
	//메소드
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		Student kim = new Student();
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);

		System.out.println("이름: " + kim.getName());
		kim.showInfo();

		Student park = new Student("22-002", "박희수", 85);
		park.showInfo();

		Student baek = new Student("22-003", "백나현", 85);
		baek.showInfo();

		// 학생추가.

		Course course = new Course("김철수", "1-3", 25);
		System.out.println("선생님: " + course.getTname());
		System.out.println("반정보: " + course.getBname());

		// 학생등록.
		course.addStudent(kim);
		course.addStudent(park);
		course.addStudent(baek);
		// 학생리스트 보기.
		course.getStudents();
		//최고점 학생정보보기.
		System.out.println("최고점수 학생: ");
		Student maxStudent = course.getMaxStudent();
		maxStudent.showInfo();
		
		// 반평균.
		System.out.println("반 평균: " + course.getAvgScore());
		

	}

}
