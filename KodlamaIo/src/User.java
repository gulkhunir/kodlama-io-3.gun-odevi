
public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, int age) {
		this.id=id;
		this.age=age;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
