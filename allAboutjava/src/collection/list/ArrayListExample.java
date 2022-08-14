package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String args[]) {
		List<String> al = new ArrayList<String>(); // creating array list
		al.add("Z"); // adding elements
		al.add("T");
		al.add("A");
		al.add("A");//it allosws du
		Iterator<String> itr = al.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
		/*It allows Duplicate value.
		 * Order is same at the time of iterating the list objects.
		 * 
		 * Manipulation with ArrayList is slow 
		 * because it internally uses an array.
		 *  If any element is removed from the array,
		 *   all the other elements are shifted in memory.
		 */
	}
}
