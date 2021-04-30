
public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Emircan");
		
		Student student1 = new Student();
		student1.setFirstName("Can");
		student1.setStudentNumber("A302");
		
		
		
		System.out.println(student1.getStudentNumber());
		
		User[] users = {instructor1,student1};
		UserManager userManager = new UserManager();
		
		userManager.addMultiple(users);
		
		userManager.remove(student1);
		
		userManager.update(instructor1);

	}

}
