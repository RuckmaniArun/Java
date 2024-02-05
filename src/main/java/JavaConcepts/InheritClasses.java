package JavaConcepts;

import OopsConcepts.StaticMethod;

public class InheritClasses extends StaticMethod {


	protected InheritClasses(int z) {
		super(z); //It calls OopsConcepts.StaticMethod constructor using super keyword
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		InheritClasses c1=new InheritClasses(110);

	}

}
