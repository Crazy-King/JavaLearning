package studentFlow;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable{
	private int id;
	private String name;
	private int age;
	private double grade;

	public Student() {

	}

	public Student(int id, String name, int age, double grade) {
		this.id = id;
		this.setName(name);
		this.setAge(age);
		this.setGrade(grade);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 10) {
			throw new IllegalArgumentException("name's length should <=10 " + name.length());
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("age should >0 " + age);
		}
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade < 0 || grade > 100) {
			throw new IllegalArgumentException("grade should be in [0,100] " + grade);
		}
		this.grade = grade;
	}

	public void writeData(PrintWriter out) {
		out.println(id + "|" + name + "|" + age + "|" + grade);
	}
	
	public void readData(Scanner in){
		String line = in.nextLine();
		String[] tokens = line.split("\\|");
		id = Integer.parseInt(tokens[0]);
		name = tokens[1];
		age = Integer.parseInt(tokens[2]);
		grade = Double.parseDouble(tokens[3]);
	}
	
	
	
	
}
