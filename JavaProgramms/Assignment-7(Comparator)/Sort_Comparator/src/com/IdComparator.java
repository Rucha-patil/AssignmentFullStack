package com;

import java.util.*;  

class IdComparator implements Comparator<Employee>{  

	public int compare(Employee e1,Employee e2){  
			if(e1.Id==e2.Id)  
				return 0;  
			else if(e1.Id>e2.Id)  
				return 1;  
			else  
				return -1;  
	}  
}  