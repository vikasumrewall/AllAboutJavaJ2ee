package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String args[]) {
		Set<String> set = new LinkedHashSet<String>(); // creating array list
		set.add("Z"); // adding elements
		set.add("T");
		set.add("A");
		set.add("M");
		set.add("A");//It does not allows Duplicate values.
		Iterator<String> itr = set.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
		
		/*It does not allows Duplicate values.
		 * Order will be the same at the  time of iterating the list objects.
		 */
	}
}
