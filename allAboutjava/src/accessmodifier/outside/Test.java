package accessmodifier.outside;

import accessmodifier.AccessModifier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier avm=new AccessModifier();
		System.out.println(avm.id);//it can be  accessible everywhere
		//System.out.println(avm.name);///it can be  accessible only within  packge
		//System.out.println(avm.rollNo);
	//	System.out.println(avm.section;//it will give error 
	}

}
