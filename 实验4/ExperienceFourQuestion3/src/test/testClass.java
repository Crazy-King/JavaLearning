package test;

import shape.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class testClass {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Circle circle1 = new Circle(4.5);
		Circle circle2 = new Circle(5.6);

		// Class<?> c = Class.forName("shape.Circle");
		// Field[] fields = c.getDeclaredFields();
		//
		// for (Field f : fields) {
		// f.setAccessible(true);
		// }
		//
		// for (Field f : fields) {
		// String field = f.toString().substring(f.toString().lastIndexOf(".") +
		// 1); // 取出属性名称
		// System.out.println("Property:" + field);
		// }
		//
		// getMethod(circle1);
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println(“请输入你的姓名：”);
		//
		// String name = sc.nextLine();

		Scanner classNameScanner = new Scanner(System.in);
		String className = classNameScanner.nextLine();
		getMethodAndProperty(className);
	}

	public static void getMethodAndProperty(String className) throws ClassNotFoundException {
		Class<?> c = Class.forName(className);

		
		Field[] fields = c.getDeclaredFields();

		for (Field f : fields) {
			f.setAccessible(true);
		}

		for (Field f : fields) {
			String field = f.toString().substring(f.toString().lastIndexOf(".") + 1); 
			System.out.println("Property:" + field);
		}
		Method[] m = c.getMethods();
		for (Method method : m) {
			System.out.println("Method: " + method.getName());
		}
	}

}
