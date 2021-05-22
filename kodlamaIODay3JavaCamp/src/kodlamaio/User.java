package kodlamaio;

public class User {
	private int _id;
	private String _firstName;
	private String _lastName;
	private String _eMail;
	private String _password;
	private String _courses;
	
	public User() {
		
	}
	public User(int id, String firstName, String lastName, String eMail, String password, String courses) {
		this();
		this._id = id;
		this._firstName = firstName;
		this._lastName = lastName;
		this._eMail = eMail;
		this._password = password;
		this._courses = courses;
	}
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String firstName) {
		this._firstName = firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String lastName) {
		this._lastName = lastName;
	}
	public String geteMail() {
		return _eMail;
	}
	public void seteMail(String eMail) {
		this._eMail = eMail;
	}
	public String getPassword() {
		return _password;
	}
	public void setPassword(String password) {
		this._password = password;
	}
	public String getCourses() {
		return _courses;
	}

	public void setCourses(String courses) {
		this._courses = courses;
	}
}
