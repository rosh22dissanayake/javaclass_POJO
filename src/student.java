
public class student {
	
	

	private String name;
	private int id;
	private int age;
	private String email;
	
	public student() {
		
		//default constructor
	}

	public student(String name, int id, int age, String email) {
	
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail(){
		return email;
		
	}
	
	public void setEmail(String email){
	         this.email =email;
		
	}	

	public void msg() {
		System.out.println(name+ " " + id + " " + age + " " + email);
	}

}
