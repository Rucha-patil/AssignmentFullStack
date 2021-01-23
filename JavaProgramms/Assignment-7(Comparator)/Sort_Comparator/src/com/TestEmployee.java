package com;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class TestEmployee{  
public static void main(String args[]){ 
	Scanner sc=new Scanner(System.in);
 
ArrayList<Employee> al=new ArrayList<>();  
	al.add(new Employee(101,"Vijay",23000));  
	al.add(new Employee(125,"Ajay",45000));  
	al.add(new Employee(108,"Shashi",15000));  
	al.add(new Employee(112,"Geeta",32000));
    
	

	
	
	
  
	
	
	
	System.out.println("Sort the document by /n 1.Id /n 2.Name /n 3salary");
	int a=sc.nextInt(); 
	switch (a) {
	case 1:
	{
		
			System.out.println("sort by /n 1.asc /n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Id in Ascending Order:");  
						Collections.sort(al,new IdComparator());  
		 
						for(Employee e: al)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List empList = (List) Arrays.asList(al);
				
						Collections.reverse(al);
						System.out.println("Sort by Id in Descending Order:");
						printArrayList(al);
						for(Employee e: al)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
	
		}
		break;	
			
	}
	
	case 2:
	{
		
			System.out.println("Sort by Name /n 1.asc /n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Name in Ascending Order:");  
						Collections.sort(al,new NameComparator());  
		 
						for(Employee e: al)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List empList = (List) Arrays.asList(al);
				
						Collections.reverse(al);
						System.out.println("Sort by Name in Descending Order:");
						printArrayList(al);
						for(Employee e: al)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
	
			}
		break;
		}
	case 3:
	{
		
			System.out.println("Sort by Name /n 1.asc /n 2. desc");
			int b = sc.nextInt();
			switch (b)
			{
				case 1:
				{
						System.out.println("Sort by Salary in Ascending Order:");  
						Collections.sort(al,new salaryComparator());  
		 
						for(Employee e: al)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
				case 2:
				{
						List empList = (List) Arrays.asList(al);
				
						Collections.reverse(al);
						System.out.println("Sort by Salary in Descending Order:");
						printArrayList(al);
						for(Employee e: al)
						{  
							System.out.println(e.Id+" "+e.Name+" "+e.salary);  			
						} 
						break;
				}
	
		}
		
		
		
		break;
}

	default:
		break;
	}
  
}

private static void printArrayList(ArrayList<Employee> al) {
	// TODO Auto-generated method stub
	
}




}

 