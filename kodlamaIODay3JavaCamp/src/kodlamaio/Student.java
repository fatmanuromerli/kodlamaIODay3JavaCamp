package kodlamaio;

public class Student extends User{
private String _courseSign;
	
	public Student() {
		
	}

	public Student(String courseSign) {
		super();
		this._courseSign = courseSign;
	}

	public String getRegisteredCourses() {
		return _courseSign;
	}

	public void setRegisteredCourses(String courseSign) {
		this._courseSign = courseSign;
	}
}
