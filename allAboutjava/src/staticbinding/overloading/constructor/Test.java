package staticbinding.overloading.constructor;

public class Test {
	public static void main(String[] args) {
		
		Add add=new Add();
		
		
		Add addInt=new Add(1,2);
		
		Add addDouble=new Add(1.2,2.4);
		
	}

	

	
}
