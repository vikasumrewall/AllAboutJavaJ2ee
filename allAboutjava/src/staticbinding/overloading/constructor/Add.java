package staticbinding.overloading.constructor;

class Add {
	public  Add() {
		System.out.println("example of constgructor loverlaoding"); 
	}

	
	public  Add(int a, int b) {
		System.out.println((a + b)); 
		System.out.println("example of constgructor loverlaoding"); 
	}

	public  Add(double a, double b) {
		System.out.println((a + b)); 
		System.out.println("example of constgructor loverlaoding"); 
	}
}


