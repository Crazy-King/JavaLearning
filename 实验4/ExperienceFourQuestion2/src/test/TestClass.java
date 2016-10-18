package test;
import java.util.Arrays;
import java.util.Comparator;

import javax.imageio.stream.MemoryCacheImageInputStream;

import person.*;
public class TestClass {

	public static void main(String[] args) {
//	 TODO   编写一个测试类，在测试类中添加若干个 Employee, Manager 实例 (个数及内容自定)，并在测试类中定义并测试如下方法：
//		  ①编写一个方法 private static void printName(Person[] persons) 打印出每个人的名字；
//		  ②编写一个方法 private static void printSalary(Employee[] employees)打印出 Employee 类
//			或者其子类对象的薪水(注意：Employee 的薪水只有 salary，Manager 的薪水为 salary+bonus)；
//		  ③编写一方法 private static void sortBySalary(Employee[] employees)，支持对 Employee 类及其子类按照各自的薪水降序排序；
//		  ④编写一方法 private static void sortByAge(Person[] person)，对 Person 对象按照年龄升序排序，再编写一个方法按 name 升序进行排序；
//		  ⑤(选做) 编写一方法 sortByDateHired，支持对 Employee 类及其子类按照各自的 dateHired 升序排序，可以使用 java.util.Date 类的 getTime 方法。
		java.util.Date date1 = new java.util.Date(1988, 6, 4);
		java.util.Date date2 = new java.util.Date(1998, 5, 24);
		java.util.Date date3 = new java.util.Date(1996, 7, 28);
		java.util.Date date4 = new java.util.Date(1986, 4, 7);
		
		Employee Bob = new Employee("Bob", 20, false, "13777777777", "UK", "123@gmail.com", "COO", 30000, date1);
		Manager Aimee = new Manager("Aimee", 22, true, "10086", "US", "234@gmail.com", "CTO", 35000, date2, 2000);
		Manager Angelia = new Manager("Angelia", 18, true, "10010", "CN", "345@gmail.com", "PM", 28000, date3, 3000);
		Manager Dave = new Manager("Dave", 35, false, "15555555555", "JP", "456@gmail.com", "PV", 18000, date4, 2500);
		
		Employee[] employees = new Employee[4];
		employees[0] = Bob;
		employees[1] = Aimee;
		employees[2] = Angelia;
		employees[3] = Dave;
		
		printName(employees);
		sortBySalary(employees);
		printSalary(employees);
		sortByAge(employees);
		printName(employees);
		sortByDateHired(employees);
		printName(employees);
		
	}
	
	private static void printName(Person[] persons){
		for (int i = 0; i < persons.length; i++) {
			System.out.print(persons[i].getName() + " ");
		}
		System.out.print("\n");
	}
	
	private static void printSalary(Employee[] employees){
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof Manager) {
				Manager aManager = (Manager) employees[i];
				double managerSalary = aManager.getSalary() + aManager.getBonus();
				System.out.println(aManager.getName() + "的薪水是：" + managerSalary);
			}else {
				System.out.println(employees[i].getName() + "的薪水是：" + employees[i].getSalary());
			}
		}
	}
	
	private static void sortBySalary(Employee[] employees){
		Arrays.sort(employees, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2){
				double e1Salary = e1.getSalary();
				double e2Salary = e2.getSalary();
				if (e1 instanceof Manager) {
					Manager m1 = (Manager)e1;
					e1Salary += m1.getBonus();
				}
				if (e2 instanceof Manager) {
					Manager m2 = (Manager)e2;
					e2Salary += m2.getBonus();
				}
				if (e1Salary > e2Salary) {
					return 1;
				}else if (e1Salary < e2Salary) {
					return -1;
				}else {
					return 0;
				}
			}
		});
	}
	
	private static void sortByAge(Person[] person){
		Arrays.sort(person, new Comparator<Person>() {
			public int compare(Person p1, Person p2){
				if (p1.getAge() > p2.getAge()) {
					return -1;
				}else if (p1.getAge() < p2.getAge()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
	}
	
	private static void sortByName(Person[] person) {
		Arrays.sort(person, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				if (p1.getName().compareTo(p2.getName()) < 0) {
					return 1;
				}else if (p1.getName().compareTo(p2.getName()) < 0){
					return -1;
				}else {
					return 0;
				}
			}
		});
	}
	
	private static void sortByDateHired(Employee[] employees){
		Arrays.sort(employees, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2){
				if (e1.getDateHired().getTime() > e2.getDateHired().getTime()) {
					return -1;
				}else if (e1.getDateHired().getTime() < e2.getDateHired().getTime()) {
					return 1;
				}else {
					return 0;
				}
			}
		});
	}
}
