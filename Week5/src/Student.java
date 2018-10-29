
public class Student {
	// Instance Variables
	
	String studentName;
	int studentNumber, examCount;
	double studentAverage;
	
	
	public Student (String studentName, int studentNumber, double studentAverage, int examCount) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.studentAverage = studentAverage;
		this.examCount = examCount;
	}
	
	public void setStudentName(String nameInput) {
		this.studentName = nameInput;
	}
	
	public void setStudentAverage(double studentAverage) {
		if (studentAverage < 0) {
			System.out.println("Please enter a valid number that's not negative");
		}
		
		else if (studentAverage > 100) {
			System.out.println("Please enter a percentage average");
		}
		
		else {
		this.studentAverage = studentAverage;
		}
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public double getStudentAverage() {
		return studentAverage;
	}
	
	public String getStudentDetails() {
		
		String details = "";
				details += "The Student's name is: " + getStudentName() + "\n";
				details += "The Student's number is: " + getStudentNumber() + "\n";
				details += "The Student's Average is: " + String.format("%.2f", getStudentAverage())+"\n";
				details += "--------------------------------";
				
				return details;
	}
	
	public void addExamResult(double examResult) {
		if (examResult < 0) {
			System.out.println("Please enter a valid number that's not negative");
		}
		
		else if (examResult > 100) {
			System.out.println("Please enter a percentage value");
		}
		
		else {
		
		studentAverage = (((studentAverage * examCount) + examResult)/ (examCount + 1));
		}
	}
	
	
}
