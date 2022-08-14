package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String args[]) {
		SortedSet<String> sortedSet = new TreeSet<String>(); // creating array list
		sortedSet.add("Z"); // adding elements
		sortedSet.add("T");
		sortedSet.add("A");
		sortedSet.add("A");
		Iterator<String> itr = sortedSet.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
		
		/*It does not allows Duplicate values.
		 * Order be sorted in ascending time of iterating the list objects.
		 */
	}
}
