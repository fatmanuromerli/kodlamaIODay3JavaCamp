package kodlamaio;

public class StudentManager extends UserManager {
	public void courseSign(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+ " adli ogrenci kursa kayit oldu : " + user.getCourses());
	}
}
