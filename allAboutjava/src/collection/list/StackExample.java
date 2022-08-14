package collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class StackExample {

	public static void main(String[] args) {
		Stack<String> v = new Stack<String>(); // creating stack 
		v.push("Z"); // adding elements
		v.push("T");
		v.push("A");
		v.push("A");//It allows duplicate values
		
		v.pop();//to remove the last object first(LIFO)
		Iterator<String> itr = v.iterator();
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
