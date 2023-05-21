package comparator_comprarble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String[] args) {
		
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10 < o2%10)
					return 1;
				else
					return -1;
			}
			
		};
		
		List<Integer> nums = new ArrayList<>();
		nums.add(123);
		nums.add(9028);
		nums.add(237);
		nums.add(907);
		
		Collections.sort(nums, com);
		
		for (Integer i : nums) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------");
		
		// ----------------------------------------------------
		
		Comparator<Students> ageCom = new Comparator<Students>() {

			@Override
			public int compare(Students o1, Students o2) {
				if(o1.name.length() > o2.name.length())
					return 1;
				else
					return -1;
						
			}
			
		};
		
		List<Students> studs = new ArrayList<>();
		
		studs.add(new Students("Surjeet", 21));
		studs.add(new Students("Archi",78));
		studs.add(new Students("Sarika", 23));
		
		Collections.sort(studs,ageCom);
		
		for (Students students : studs) {
			System.out.println(students);
		}
	}

}

class Students {
	String name;
	int age;
	
	
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
