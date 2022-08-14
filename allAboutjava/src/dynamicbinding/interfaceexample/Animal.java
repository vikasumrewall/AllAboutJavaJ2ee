package dynamicbinding.interfaceexample;

public abstract class Animal {
	
	
	abstract public void  live(String animalType);
	
	abstract public void  eat();
	
	
	
	
	static public void sit()
	{
		System.out.println("Animal are sitting");
		
	}
	
	private  void sleep()
	{
		System.out.println("Animal are sleeping.");
		
	}

}
