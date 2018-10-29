
public class StudentTester {

	public static void main(String[] args) {
		
		Student stu1 = new Student ("Tom", 2 , 64, 2);
		
		System.out.println(	stu1.getStudentDetails());
		
		stu1.setStudentAverage(44);
		System.out.println(	stu1.getStudentDetails());
		
		stu1.setStudentName("Sam");
		System.out.println(	stu1.getStudentDetails());
		
		stu1.addExamResult(99);
		System.out.println(	stu1.getStudentDetails());
		
	}

}
