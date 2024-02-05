package OopsConcepts;
public class StaticClassInherit extends StaticMethod{

	StaticClassInherit(int z) {
		super(z); //It calls OopsConcepts.StaticMethod constructor using super keyword
		// TODO Auto-generated constructor stub
	}
	
	
	//Constructor
		/*protected StaticMethod( int z){
			this.x=z;
		}*/

	public static void main(String[] args) {
		
		System.out.println("Print value of.."+y);
		display(3);
		StaticClassInherit m1=new StaticClassInherit(9);

	}

}
