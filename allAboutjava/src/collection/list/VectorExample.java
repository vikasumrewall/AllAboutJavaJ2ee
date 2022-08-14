package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {
		List<String> vector = new Vector<String>(); // creating array list
		vector.add("Z"); // adding elements
		vector.add("T");
		vector.add("A");
		vector.add("A");//It allows duplicate values
		Iterator<String> itr = vector.iterator();
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
