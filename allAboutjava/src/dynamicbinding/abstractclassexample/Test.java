package dynamicbinding.abstractclassexample;

public class Test {
	
	public static void main(String[] args) {
		Animal animal=new BullDog();
		animal.live("Mamal");
		animal.eat();
        animal.lay();        
        Animal.sit();
        
      //  animal.bullDogBark()//This is not avaliable in ths object 
        // because we have parent class at the lft side.
		
	}
	
	

}
