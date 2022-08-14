package dynamicbinding.interfaceexample;

public abstract class Dog extends Animal {

	@Override
	public void live(String animalType) {
		
			System.out.println("I am "+ animalType+". I can live.");
		
		
	}

}
