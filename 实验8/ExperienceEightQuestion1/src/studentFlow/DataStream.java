package studentFlow;

import java.io.*;

public class DataStream {

	public static void main(String args[]) throws IOException {
		Student Bob = new Student(1, "Bob", 18, 98.8);
		
		FileOutputStream fos = new FileOutputStream("Student.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		try {
			dos.writeInt(Bob.getId());
			dos.writeUTF(Bob.getName());
			dos.writeInt(Bob.getAge());
			dos.writeDouble(Bob.getGrade());
		} finally {
			dos.close();
		}
		FileInputStream fis = new FileInputStream("Student.txt");
		DataInputStream dis = new DataInputStream(fis);
		try {
			System.out.println("\t ID: " + dis.readInt());
			System.out.println("\t Name: " + dis.readUTF());
			System.out.println("\t Age: " + dis.readInt());
			System.out.println("\t Grade: " + dis.readDouble());
		} finally {
			dis.close();
		}
	}
}
