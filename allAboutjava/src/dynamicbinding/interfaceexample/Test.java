package dynamicbinding.interfaceexample;

public class Test {
	
	public static void main(String[] args) {
		Animal animal=new BullDog();
		animal.live("Mamal");
		animal.eat();
        Animal.sit();
		
	}
	
	

}
