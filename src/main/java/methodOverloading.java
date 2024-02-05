
public class methodOverloading {
	
	int c; // this is instance variable, where initialization is not required, and zero value is assigned by default
	
	public static void main(String[] args) {
		methodOverloading OL = new methodOverloading();
		OL.makeCall(994028);
		OL.makeCall("Ruckmani");
				
		int c=5; // this is local variable, while declaring it must be intialized
		OL.addnumbers(3, 3);

	}
	
	int a() {
		return 2;
	}
	
	public void makeCall(long contact) {
		System.out.println("make a call from contact number: "+contact);
	}
	
	//private method can be called within class
	private void makeCall(String contactname) {
		System.out.println("make a call from contact name: "+contactname);
	}
	
	//when no access modifier is given, it becomes default method
	void addnumbers(int a, int b) {
		int c=10; //this is local variable where it is high precedence over instance variable of same name
		System.out.println("sum with local variable: "+ (a+b+c)); //here local variable is called by default
		System.out.println("sum with instance variable: "+ (a+b+this.c)); //using this keyword instance variable can be called when local and instance variable has name
		
		System.out.println("sum with this keyword using a method: "+ (a+b+this.a() ));
		
		//however cannot be used with static method
		
		StaticMethod.display(1); // This static method is used by StaticMethod class, hence it is called using class name
	} 
}
