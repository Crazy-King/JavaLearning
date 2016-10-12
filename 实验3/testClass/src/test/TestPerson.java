package test;
import test.Person;
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person onePerson = new Person();
		onePerson.setName("Bob");
		onePerson.setAge(20);
		onePerson.setSex(0);
		System.out.println("Name: " + onePerson.getName());
		System.out.println("Age: " + onePerson.getAge());
		System.out.println("Sex: " + onePerson.getSex());
		
		System.out.println(onePerson.toString());
		
	}

}
