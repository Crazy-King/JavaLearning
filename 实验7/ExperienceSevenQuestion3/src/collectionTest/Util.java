package collectionTest;

import java.util.*;

public class Util {

	/**
	 * 
	 * @param
	 * @return 返回分布在[0,upLimit]的随机整数
	 */
	public static int getRandomNumber(int upLimit) {
		return new Random().nextInt(upLimit + 1);
	}

	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回分布在[min,max]的随机整数
	 */
	public static int getRandomNumber(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("min =" + min + ">" + "max=" + max);
		}
		return min + new Random().nextInt(max + 1 - min);
	}

	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回长度在min到max之间随机名字
	 */
	public static String getRandomName(int min, int max) {
		StringBuilder sb = new StringBuilder();

		int n = getRandomNumber(min, max);

		while (n > 0) {
			sb.append((char) getRandomNumber('a', 'z'));
			n--;
		}
		return sb.toString();
	}
	public static List<Student> getRandomStudents(int n){
		List<Student> list = new ArrayList<Student>();
		Student tempS = new Student(null, 0);
		for (int i = 0; i < n; i++) {
			tempS.setName(Util.getRandomName(0, 3));
			tempS.setAge(Util.getRandomNumber(0, 20));
			list.add(tempS);
		}
		
		return list;
	}

	public static Map makeStudentMap(List<Student> list) {
		Map map = new HashMap();
		for (Student s : list) {
			map.put(s.getName(), s);
		}

		return map;
	}

	public static Student searchStudent(Map stuMap, String name) {
		Student student = (Student) stuMap.get(name);	
		return student;
	}
	
	public static int searchName(List<String> list, String name) {
		int i = 0;
		for (String string: list){
			i++;
			if (string.equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public static List<String> generateNameList(int n){
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(getRandomName(0, 3));
		}
		
		return list;
	}
	
	public static Map generateStudentMap(int n){
		Map studentMap = new HashMap<>();
		List studentList = new ArrayList();
		
		studentList = getRandomStudents(n);
		studentMap = makeStudentMap(studentList);
		
		return studentMap;
	}
	
}
