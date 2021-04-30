
public class Instructor extends User{
	String instructorNumber;
	String instructorScore;
	
	public Instructor() {}
	
	public Instructor(String instructorNumber, String instructorScore) {
		super();
		this.instructorNumber = instructorNumber;
		this.instructorScore = instructorScore;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorScore() {
		return instructorScore;
	}

	public void setInstructorScore(String instructorScore) {
		this.instructorScore = instructorScore;
	}
	
	
}
