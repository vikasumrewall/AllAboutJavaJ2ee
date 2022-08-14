package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>(); // creating array list
		set.add("Z"); // adding elements
		set.add("T");
		set.add("A");
		set.add("A");
		Iterator<String> itr = set.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
		
		/*It does not allows Duplicate values.
		 * Order be sorted in ascending time of iterating the list objects.
		 */
	}
}
