
public class student {
	
	

	private String name;
	private int id;
	private int age;
	private String gender;
	
	public student() {
		
		//default constructor
	}

	public student(String name, int id, int age, String gender) {
	
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
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
	public String getGender(){
		return email;
		
	}
	
	public void setGender(String gender){
	         this.gender =gender;
		
	}	

	public void msg() {
		System.out.println(name+ " " + id + " " + age + " " + gender);
	}

}
