package corejavacocept.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 int id;    
	 String name;    
	 transient int age;//Now it will not be serialized  
	 public   Student(int id, String name,int age) {    
		  this.id = id;    
		  this.name = name;    
		  this.age=age;    
		 }    

	
	 
	 
	
}
