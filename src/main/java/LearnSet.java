import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	//Set does not allow duplicate values and does not maintains order

	public static void main(String[] args) {
		
		//Set<String> data1=new TreeSet<String>(); //Treeset stores data in ASCII order
		//Set<String> data2=new LinkedHashSet<String>(); //LinkedHash set stores data in same insertion order
		
		Set<String> data=new HashSet<String>(); //Hashset displays value in random order
		data.add("Ruckmani");
		data.add("Radha");
		data.add("Arun");
		data.add("Hanumanth");
		data.add("Aadhira");
		System.out.println(data);
		
		for (String d : data) {
			System.out.println(d);
			
		}
		
		System.out.println(data.size());
		
		System.out.println(data.contains("Hanumanth")); //In this set this is no get(), so we can pass the values to list and use get() and also to have duplicate values	
		
		List<String> getList=new ArrayList<String>(data);
		getList.add("Strawberry");
		System.out.println("The new list is.."+getList);
		System.out.println(getList.get(4));
		
		Collections.sort(getList); //we can sort only in List, not in set, but we can do in implemented class TreeSet
		
		System.out.println(getList);

	}

}
