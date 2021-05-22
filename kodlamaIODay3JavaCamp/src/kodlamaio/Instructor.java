package kodlamaio;

public class Instructor extends User {
	private String _courses;
	public Instructor() {
		
	}
	

	public Instructor(String courses) {
		this();
		this._courses = courses;
	}

	public String getCourses() {
		return _courses;
	}

	public void setCourses(String courses) {
		this._courses = courses;
	}
}
