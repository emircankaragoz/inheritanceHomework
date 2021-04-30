
public class Student extends User {
	String studentNumber;
	String studentScore;
	
	public Student() {
		
	}
	
	public Student(String studentNumber, String studentScore) {
		super();
		this.studentNumber = studentNumber;
		this.studentScore = studentScore;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(String studentScore) {
		this.studentScore = studentScore;
	}
	
}
