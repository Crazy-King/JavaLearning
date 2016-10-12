package test;
import test.Person;
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person PersonA = new Person("Bob", 20, 0);
		Person PersonB = new Person("Jonny", 25);
		PersonB.setSex(1);
		System.out.println(PersonB.toString());
		System.out.println(PersonA.toString());
		
	}

}
