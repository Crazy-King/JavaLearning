package test;

import java.util.Comparator;

import javax.annotation.processing.SupportedAnnotationTypes;

import person.Person;

public class ComplexComparator implements Comparator<Person> {

	int sortTypeName = 1;
	int sortTypeAge = 1;

	public ComplexComparator(boolean positiveName, Boolean positiveAge) {
		if (positiveName == false) {
			sortTypeName = -1;
		}
		if (positiveAge == false) {
			sortTypeAge = -1;
		}
	}

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1 * sortTypeName;
		} else if (o1.getName().compareTo(o2.getName()) == 0) {
			if (o1.getAge() == o2.getAge()) {
				return 0;
			} else if (o1.getAge() > o2.getAge()) {
				return 1 * sortTypeAge;
			} else {
				return (-1) * sortTypeAge;
			}
		} else {
			return (-1) * sortTypeName;
		}

	}

}
