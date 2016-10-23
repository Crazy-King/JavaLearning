package test;

import java.util.Comparator;

import person.Person;

public class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		}else if (o1.getName().compareTo(o2.getName()) == 0) {
			return 0;
		}else {
			return -1;
		}
	}
	
}
