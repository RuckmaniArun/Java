import java.util.ArrayList;
import java.util.List;


public class LearnList {
	
	//List allows duplicate values and maintains the order

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Orange");
		list.add("Banana");
		list.add("orange");
		list.add("apple");
		
		System.out.println("Banana is present.."+list.contains("Banana"));
		
		int size = list.size();
		System.out.println("Size is.."+size);
		
		System.out.println(list.get(3));
		
		list.remove("apple");
		
		System.out.println(list);
		
		boolean r = list.removeAll(list);
		System.out.println("Is removed "+r+"  "+list);
		
		System.out.println(list.isEmpty());

	}

}
