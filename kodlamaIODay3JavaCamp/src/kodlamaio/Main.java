package kodlamaio;

public class Main {

	public static void main(String[] args) {
		// User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)
		//UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Fatmanur");
		student.setLastName("Omerli");
		student.seteMail("FatOm123@gmail.com");
		student.setPassword("FatOm123");
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.seteMail("EnDem123@gmail.com");
		instructor.setPassword("EnDem123");
		
		UserManager userManagerAdd=new UserManager();
		userManagerAdd.add(student);
		userManagerAdd.add(instructor);
		
		UserManager userManagerEnter=new UserManager();
		userManagerEnter.enter(student);
		userManagerEnter.enter(instructor);
		
		UserManager userManagerUpdate=new UserManager();
		userManagerUpdate.update(student);
		userManagerUpdate.update(instructor);
		
		UserManager userManagerDelete=new UserManager();
		userManagerDelete.delete(student);
		userManagerDelete.delete(instructor);
		
		
		
	}

}
