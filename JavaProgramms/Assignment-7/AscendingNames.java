import java.util.Arrays;
import java.util.Collections;


public class AscendingNames
{
	public static void main(String args[])
	{
		String names[]={"Raj","ravi","Akash","ajay"};
		
		//Ascending Order//
		Arrays.sort(names);
        System.out.println("Ascending Order : ");
		System.out.println(Arrays.toString(names));
		
		//Descending Order//
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println("Descending Order : ");
		System.out.println(Arrays.toString(names));
	

	}
	
}


