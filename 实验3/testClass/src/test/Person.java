package test;

public class Person {
	private String name;
	private int age;
	private int sex;
	
	public Person(){
		this.setName("");
		this.setSex(0);
		this.setAge(0);
	}
	
	public String toString(){
		return ("Name: " + this.getName() + "\n")
				+ ("Age: " + this.getAge() + "\n")
				+ ("Sex: " + this.getSex() + "\n");
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
}
