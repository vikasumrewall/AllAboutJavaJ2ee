package accessmodifier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier avm=new AccessModifier();
		
		
		/*
		 * public variables are available everywhere
		 */

		System.out.println("public variable id " + avm.id);

		/*
		 * Protected variables are available in sub class
		 * 
		 */

		System.out.println("Protected variable name" + avm.name);

		/*
		 * Default variables are not available in sub class
		 */

		 System.out.println("default variable roll no "+avm.rollNo); //

		/*
		 * private variables are not available everywhere
		 */

		// System.out.println("private variable section "+avm.section);
	}

}
