package OopsConcepts;
import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		String[] fruits= {"Orange","Apple","Pears"};
		System.out.println(Arrays.toString(fruits));
		//System.out.println("Length is :"+length);
		int length = fruits.length;
		System.out.println("Length is :"+length);
		System.out.println(fruits[length-1]);
		
		String[] Add_fruits=new String[length+1]; //To add new value to an array, this can be followed
		for(int i=0;i<Add_fruits.length;i++) {
			Add_fruits[i]=fruits[i];
			Add_fruits[length-1]="Banana";
			fruits=Add_fruits;
			//System.arraycopy(fruits, srcPos, dest, destPos, length);
		}
		System.out.println(fruits[length-1]); 

	}

}
