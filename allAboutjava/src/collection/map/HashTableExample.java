package collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	 public static void main(String[] args)   
     {   
         Map h=new Hashtable();   
         h.put(100,"Stark");   
         h.put(101,"Michale");   
         h.put(102,"Ani");   
         //h.put(null,"Sofia");  //it will give error HAshTable does not store null variables 
         System.out.println(h);   
     }   
	 
	 /*
	  * It  does not allow adding duplucate keys.
	  * it will give error if, you try to add null keys in HashTable. 
	  */

}
