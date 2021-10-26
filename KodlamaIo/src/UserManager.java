
public class UserManager {

	private String id;

	public void add(String firstName, String lastName) {
		System.out.println("Kullanici kaydedildi. "+ firstName +" "+lastName);
	}
	
	public void remove(String firstName, String lastName) {
		System.out.println("Kullanici silindi. "+ firstName +" "+lastName);
	}
	
	public void update(String firstName, String lastName) {
		System.out.println("Kullanici guncellendi. "+ firstName +" "+lastName);
	}
	
	public void idCalculate(String firstName, String lastName, int age) {
		String id = firstName.substring(0,1) + lastName.substring(0,1)+age;
		this.id=id;
	}
	
	public void studentDisplay(String firstName, String lastName,int age, String courseAttended) {
		idCalculate(firstName,lastName,age);
		
		System.out.println("\n\nOGRENCI BILGILERI\n"
				+"Ad Soyad :"+firstName+" "+lastName+"\n"
				+"Katildigi Kurs :"+courseAttended+"\n"
				+"Yas :"+age+"\n"
				+"OgrenciID :" +id);
	}
	public void instructorDisplay(String firstName, String lastName,int age, double salary) {
		idCalculate(firstName,lastName,age);
			
		System.out.println("\n\nOGRETMEN BILGILERI\n"
				+"Ad Soyad :"+firstName+" "+lastName+"\n"
				+"Maas :"+salary+"\n"
				+"Yas :"+age+"\n"
				+"Ogretmen ID :" +id);
	}
	
	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}
	
}