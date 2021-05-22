package kodlamaio;

public class UserManager extends User {
	
	
	
	public void add(Instructor instructor) {
		
		System.out.println("Egitmen eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
}
	public void add(Student student) {
	
		System.out.println("Ogrenci eklendi: "+student.getFirstName()+" "+student.getLastName());
}

	public void enter(Instructor instructor) {
		
		System.out.println("Egitmen giris yapti: "+instructor.getFirstName()+" "+instructor.getLastName());
}
	public void enter(Student student) {
	
		System.out.println("Ogrenci giris yapti: "+student.getFirstName()+" "+student.getLastName());
}
	public void update(Student student) {
		System.out.println("Kullanici güncellendi : "+student.getFirstName()+" "+student.getLastName());
	}
	public void update(Instructor instructor) {
		System.out.println("Kullanici güncellendi : "+instructor.getFirstName()+" "+instructor.getLastName());
	}
	public void delete(Student student) {
		System.out.println("Kullanici Silindi: "+student.getFirstName()+" "+student.getLastName());
	}
	public void delete(Instructor instructor) {
		System.out.println("Kullanici Silindi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}

	
	
}
