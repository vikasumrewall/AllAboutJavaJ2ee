package corejavacocept.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		 //  seriazation//
		Student s1 =new Student(211,"ravi",22);//creating object    
		  //writing object into file    
		  FileOutputStream f=new FileOutputStream("f.txt");    
		  ObjectOutputStream out=new ObjectOutputStream(f);    
		  out.writeObject(s1);    
		  out.flush();    
		  out.close();    
		  f.close();    
		  System.out.println("success");   
		  // done//
		  
		  
		  //deseriazation//
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));    
		  Student s=(Student)in.readObject();    
		  System.out.println(s.id+" "+s.name+" "+s.age);    
		  in.close(); 
		  // deseriazation//

			
		
	}

}
