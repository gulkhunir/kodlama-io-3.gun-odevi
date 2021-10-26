
public class Student extends User{
	private String coursesAttended;

	public Student() {
		
	}
	
	public Student(String coursesAttended) {
		this.coursesAttended=coursesAttended;
	}
	
	
	
	
	
	public String getCoursesAttended() {
		return coursesAttended;
	}

	public void setCoursesAttended(String coursesAttended) {
		this.coursesAttended = coursesAttended;
	}
	
	
	
}
