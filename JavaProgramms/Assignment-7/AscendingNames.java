import java.util.Arrays;
import java.util.Collections;

public class AscendingNames
{
	public static void main(String args[])
	{
		String names[]={"Amrut","ajay","Aaditi","Riya","Bablu"};
		
		int size = names.length;
		
		Arrays.sort(names);
		//Ascending Order//
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Ascending Order : ");
		System.out.println(Arrays.toString(names));
		
		//Descending Order//
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println("Descending Order : ");
		System.out.println(Arrays.toString(names));
		

	}
}