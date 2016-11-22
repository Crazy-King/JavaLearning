package collectionTest;

import java.util.*;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[100];
		List<Student> studentsList = new ArrayList<Student>();
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(Util.getRandomName(4, 4), Util.getRandomNumber(20), Util.getRandomNumber(100));
			studentsList.add(students[i]);
		}
		
		Collections.sort(studentsList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getGrade() < o2.getGrade()) {
					return -1;
				}else if (o1.getGrade() > o2.getGrade()) {
					return 1;
				}else {
					return 0;
				}
			}
			
		});
		
		for (Student student : studentsList){
			System.out.print(student.getName() + " " + student.getGrade() + "\n");
		}
		
		System.out.print(
		"最大：" +
		Collections.max(studentsList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getGrade() < o2.getGrade()) {
					return -1;
				}else if (o1.getGrade() > o2.getGrade()) {
					return 1;
				}else {
					return 0;
				}
			}
			
		}).getName()
		+ "\n"
		);
		
		System.out.print(
		"最小：" +		
		Collections.min(studentsList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getGrade() < o2.getGrade()) {
					return -1;
				}else if (o1.getGrade() > o2.getGrade()) {
					return 1;
				}else {
					return 0;
				}
			}
			
		}).getName()
		+ "\n"
		);
		
		List<Student> otherList = new ArrayList<Student>();
		otherList = gradeLessThanSixt(studentsList);
		System.out.println("小于60：");
		for (Student student : otherList){
			System.out.print(student.getName() + " " + student.getGrade() + "\n");
		}
		
		System.out.println("移除小于60后：");
		studentsList.removeAll(otherList);
		for (Student student : studentsList){
			System.out.print(student.getName() + " " + student.getGrade() + "\n");
		}
		
		System.out.println("打乱顺序：");
		Collections.shuffle(studentsList);
		for (Student student : studentsList){
			System.out.print(student.getName() + " " + student.getGrade() + "\n");
		}
		
		System.out.println("转换数组：");
		Student[] newStudentsList = new Student[students.length];
		int i = 0;
		for(Student s:studentsList){
			newStudentsList[i] = s;
			i++;
			System.out.println(s.getName());
		}
	}

	public static List<Student> gradeLessThanSixt(List<Student> list){
		List<Student> otherList = new ArrayList<Student>();
		for (Student student : list){
			if (student.getGrade() < 60) {
				otherList.add(student);
			}
		}
		return otherList;
	}
	
}
