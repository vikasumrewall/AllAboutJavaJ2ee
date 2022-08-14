package accessmodifier.outside;

import accessmodifier.AccessModifier;

public class ChildClass extends AccessModifier {

	public ChildClass() {
		super();
		// TODO Auto-generated constructor stub

		/*
		 * public variables are available everywhere
		 */

		System.out.println("public variable id " + super.id);

		/*
		 * Protected variables are available in sub class
		 * 
		 */

		System.out.println("Protected variable name" + super.name);

		/*
		 * Default variables are not available in sub class
		 */

		// System.out.println("default variable roll no "+super.rollNo); //

		/*
		 * private variables are not available everywhere
		 */

		// System.out.println("private variable sesction "+super.section);
	}
}
