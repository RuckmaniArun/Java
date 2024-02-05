
public class StaticMethod {
	
	final static int y=4;
	int x;
	protected static void display(int a) {
		//
		//System.out.println(x); //non-static variable cannot be called inside a static function
		//System.out.println(this.x); //this cannot be used inside a static function
		//y=a;
		System.out.println(y);
		System.out.println("Hey!");
	}
	//Constructor
	StaticMethod( int z){
		this.x=z;
	}
	
	public void getX(){
		System.out.println("The value of x is.."+x);
		
	}
	public static void main(String[] args) {
		int d = 10;
		display(5); // static fn can be called directly, no need to use object. otherwise use class name to call it
		System.out.println("Print the value of d "+d);
		
		StaticMethod m1=new StaticMethod(6);
		m1.getX();
	}
}
