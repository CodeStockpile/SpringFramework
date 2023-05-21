/**
 * 
 */
package com.surjeet.java.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author Surjeet
 *
 */
public class IteratorAndIteratorable {


	public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
		    list.add("a");
		    list.add("b");
		    list.add("c");
		    list.add("d");
		    list.add("e");
		    list.add("f");

		    Iterator<String> iterator = list.iterator();
		    while (iterator.hasNext()) {
		        String string = iterator.next();
		        System.out.println(string);
		    }
	}

}
