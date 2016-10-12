package person;

public class Person {
//	name, address, phoneNumber, email, age, sex
	
	private String name;
	private int age;
	private boolean sex; 		//0:male 1:female
	private String phoneNumber;
	private String address;
	private String email;
	
	public Person(String name, int age, boolean sex, String phoneNumber, String address, String email){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.address = " ";
		this.email = " ";
		this.address = address;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
