package kodlamaio;

public class InstructorManager extends UserManager {
	public void kurs(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+"adl� egitmen" + user.getCourses() + "kursunu sisteme yukledi");
	}
}
