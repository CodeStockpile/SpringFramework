package comparator_comprarble;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
	// customized sorting logic for name-wise
	@Override
	public int compareTo(Student that) {
		if (this.name.length() > that.name.length())
			return 1;
		else
			return -1;

	}

}

public class ComparableDemo {

	public static void main(String[] args) {

		List<Student> studs = new ArrayList<>();

		studs.add(new Student("Surjeet", 21));
		studs.add(new Student("Archi", 78));
		studs.add(new Student("Sarika", 23));

		// Collections.sort(studs, ageCom); // need some comparator

		Collections.sort(studs); // class itself defines the sorting logic

		for (Student s : studs) {
			System.out.println(s);
		}
	}

}
