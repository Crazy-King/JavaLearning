package studentFlow;

import java.io.*;

public class ObjectStreamTest {
	public static void main(String[] args){
		Student[] students = new Student[3];

		students[0] = new Student(0, "Bob", 17, 67);
		students[1] = new Student(1, "Alice", 18, 87);
		students[2] = new Student(2, "Dave", 17, 89);
		
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("studentObject.dat"));
			outputStream.writeObject(students);
			outputStream.close();
			
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("studentObject.dat"));
			Student[] newStudent = (Student[]) inputStream.readObject();
			inputStream.close();
			
			for (Student s : newStudent)
				System.out.println(s);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	   }
}
