
public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()  + " adl� ��renci eklendi.");
	}
	
	public void studentScore(Student student) {
		System.out.println(student.getStudentScore()  + " adl� ��renci eklendi.");
	}
}	
