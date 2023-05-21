package Generics;
import java.util.List;
import java.util.ArrayList;


public class GenericWildcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(100);
		intList.add(2);
		intList.add(88);
		printList(intList);
		
		
		
	}
	
	public static void printList(List<?> obj) { // <?> wildcard
		System.out.println();
	}

}
