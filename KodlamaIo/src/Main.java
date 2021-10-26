
public class Main {

	public static void main(String[] args) {
		Student studentm = new Student();
		studentm.setFirstName("Mehmet");
		studentm.setLastName("GUVEN");
		studentm.setCoursesAttended("Java");
		studentm.setAge(33);
		
		UserManager userManager = new UserManager();
		userManager.studentDisplay(studentm.getFirstName(), studentm.getLastName(), studentm.getAge(), studentm.getCoursesAttended());
	
		Instructor instructore	=new Instructor();
		instructore.setFirstName("Engin");
		instructore.setLastName("DEMIROG");
		instructore.setSalary(10000);
		instructore.setAge(38);
		
		userManager.instructorDisplay(instructore.getFirstName(), instructore.getLastName(), instructore.getAge(), instructore.getSalary());
				
		StudentManager studentManager= new StudentManager();
		studentManager.joinNewCourse("Javascript");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.updateSalary(15000);
		
		userManager.add(studentm.getFirstName(), studentm.getLastName());
		userManager.remove(instructore.getFirstName(), instructore.getLastName());
		userManager.update(studentm.getFirstName(), studentm.getLastName());
		
		
	}

}
