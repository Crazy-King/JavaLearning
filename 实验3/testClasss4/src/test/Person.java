package test;
import java.lang.Math;
import java.util.Random;

import javax.print.attribute.standard.PresentationDirection;

public class Person {
	private String name;
	private int age;
	private int sex;
	private int id;
	static int count = 0;
	
	
	
	public Person(String name, int age){
		this.setName(name);
		this.setSex(0);
		this.setAge(age);
		this.setId((int)(Math.random() * 100000));
		count++;
	}
	
	public Person(String name, int age, int sex){
		this(name, age);
		this.sex =sex;
	}
	
	public String toString(){
		return ("Name: " + this.getName() + "\n")
				+ ("Age: " + this.getAge() + "\n")
				+ ("Sex: " + this.getSex() + "\n")
				+ ("id: " + this.getId() + "\n");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
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
