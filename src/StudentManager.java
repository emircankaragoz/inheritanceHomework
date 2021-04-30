
public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()  + " adlı öğrenci eklendi.");
	}
	
	public void studentScore(Student student) {
		System.out.println(student.getStudentScore()  + " adlı öğrenci eklendi.");
	}
}	
