package overriding.constructor;

public class Dog {
	
	public  Dog(String animalType)
	{
		System.out.println("I am Dog");		
		if("Mamal".equalsIgnoreCase(animalType))
		{
			System.out.println("I am mamal. I live on land");
		}
	}
	

}
