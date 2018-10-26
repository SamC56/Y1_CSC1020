package practical4;

public class PassFail {
public static void main(String[] args) {
	int examMark =49;
	
	System.out.println("The mark is " + examMark);
	
		if (examMark >= 70) {
			System.out.println("Distinction");
			
		} 
		
			else if (examMark >= 60 && examMark <70) {
				System.out.println("Commendation");
			}
		
			else if (examMark >= 50 && examMark <60) {
				System.out.println("Pass");
			}
		
			else if (examMark < 50) {
				System.out.println("Fail");
			}
	}
}