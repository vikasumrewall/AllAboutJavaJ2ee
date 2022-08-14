package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String args[]) {
		List<String> al = new LinkedList<String>(); // creating array list
		al.add("Z"); // adding elements
		al.add("T");
		al.add("A");
		al.add("A");//it allows duplicate values
		Iterator<String> itr = al.iterator();
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
        /*
        Manipulation with LinkedList is faster than ArrayList 
        because 
        it uses a doubly linked list, so no bit shifting is required in memory.
        */
	}
}
