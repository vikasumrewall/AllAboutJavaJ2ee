package transientexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Student  implements Serializable
{
	 int  id ;
	   String name ;
    transient String password="old" ;
    // This will not serialized.this willl not be stored on hard driver 
    //while the file serization proces
    
 
   
    // constructor
    public Student(int id, String name,String password) {
        this.id = id;
        this.name = name;
        this.password = name;
    }
    
    
    
   

}