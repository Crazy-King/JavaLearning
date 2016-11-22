package collectionTest;

import java.util.*;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10000000;
		List nameList = new ArrayList();
		nameList = Util.generateNameList(number);
		
		Map studentMap = new HashMap();
		studentMap = Util.generateStudentMap(number);
		
		long startTime1 = System.currentTimeMillis();    // 获取开始时间
		Util.searchName(nameList, "Bob");
		long endTime1 = System.currentTimeMillis();    // 获取结束时间
		System.out.println("程序运行时间：" + (endTime1 - startTime1) + "ms");
		
		long startTime2 = System.currentTimeMillis();    // 获取开始时间
		Util.searchStudent(studentMap, "Bob");
		long endTime2 = System.currentTimeMillis();    // 获取结束时间
		System.out.println("程序运行时间：" + (endTime2 - startTime2) + "ms");

	}
}
