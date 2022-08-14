package overriding.method;

public class Animal {
	

		public String animalType;

		public String getAnimalType() {
			return animalType;
		}

		public void setAnimalType(String animalType) {
			this.animalType = animalType;
		}
		
		protected Object live()
		{
			System.out.println("I live on this earth");
			return new Object();
		}
	

}
