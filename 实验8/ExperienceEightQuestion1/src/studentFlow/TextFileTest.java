package studentFlow;

import java.io.*;
import java.util.Scanner;

public class TextFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];

		students[0] = new Student(0, "Bob", 17, 67);
		students[1] = new Student(1, "Alice", 18, 87);
		students[2] = new Student(2, "Dave", 17, 89);

		try {
			PrintWriter out = new PrintWriter("student.dat");
			writeData(students, out);
			out.close();
			
			Scanner in = new Scanner(new FileReader("student.dat"));
			Student[] newStd = readData(in);
			in.close();
			
			for (Student s : newStd)
				System.out.println(s.getId() + " " + s.getName() + " " + s.getAge() + " " + s.getGrade());
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private static void writeData(Student[] students, PrintWriter out) throws IOException {
		out.println(students.length);
		for (Student s : students)
			s.writeData(out);
	}

	private static Student[] readData(Scanner in) {
		int n = in.nextInt();
		in.nextLine();

		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			students[i] = new Student();
			students[i].readData(in);
		}
		return students;
	}

}
