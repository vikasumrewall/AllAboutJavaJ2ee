package transientexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	
		public static void main(String[] args) throws IOException, ClassNotFoundException {
    		
			/*
			 * Serializing the class object
			 */
		 Student temp =new Student( 2, "Clausia","1234");//creating object
		 
		  // password will not serialized.this will not be stored on hard driver 
		    //while the file serialization process
		    
	        //writing temp object into file
	        FileOutputStream fread=new FileOutputStream("member.txt");
	        ObjectOutputStream fout=new ObjectOutputStream(fread);
	        fout.writeObject(temp);
	        fout.flush();

	        fout.close();
	        fread.close();
	        System.out.println("Data successfully saved in a file");
	        
	        
	        /*
			 * De-Serializing the class object
			 */
	        
	        // retrieving the data from file.
	        ObjectInputStream fin=new ObjectInputStream(new FileInputStream("member.txt"));
	        Student membr=(Student)fin.readObject();
	        System.out.println(membr.id+" "+membr.name+" ");
	        fin.close();
	        
	        
	        // you will get password nulls
	      //  password will not serialized.this will not be stored on hard driver 
		    //while the file serialization process
		    

	
	

	}

}
