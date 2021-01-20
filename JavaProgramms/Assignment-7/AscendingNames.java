package com;
import java.util.Arrays;
public class AscendingNames  {

	public static void main(String[] args) {
		String names[]= {"raj","Ravi","Akash","ajay","Amrut"};
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
		
		for(int i=0;i<names.length;i++) {
			
			System.out.println(names[i]);
			
		}

	}

}
