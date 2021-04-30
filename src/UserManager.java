
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()  + " kaydedildi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()  + " silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()  + " güncellendi.");
	}
}
