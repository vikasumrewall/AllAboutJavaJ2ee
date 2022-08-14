package dynamicbinding.abstractclassexample;

public abstract class Dog implements Animal {

	@Override
	public void live(String animalType) {
		
			System.out.println("I am "+ animalType+". I can live.");
		
		
	}

}
