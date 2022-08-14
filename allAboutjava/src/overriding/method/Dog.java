package overriding.method;

public class Dog extends Animal{
	//String animalType;
	
	
	//this is method overriding
	
	//the return type can be same or  subclass
	//the access modifier can be same of higher than parent class		
	  public String live()
	{
		  System.out.println("I am Dog");		
		if("Mamal".equalsIgnoreCase(animalType))
		{
			System.out.println("I am mamal. I live on land");
		}
		return "";
	}
	
}
