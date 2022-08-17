package polymorphism.runtimepolymorphism.dynamicbinding.abstractclassexample;

public interface Animal {
	
	
	 public void  live(String animalType);
	
	abstract public void  eat();
	
	
	default public void lay()
	{
		System.out.println("Animal are laying");
		
	}
	
	static public void sit()
	{
		System.out.println("Animal are sitting");
		
	}
	
	private  void sleep()
	{
		System.out.println("Animal are sleeping.");
		
	}

}
