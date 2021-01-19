import java.util.*;

class  Employee
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of records you want to save");	
		int rec=sc.nextInt(); //Taking records
		

		int[] id=new int[rec];	// All data arrays
		String[] name  =new String[rec];
		double[] salary=new double[rec];
		String[] desg  =new String[rec];
		
		
		for(int row=0;row<rec;row++)
		{
			System.out.println("Enter Details of "+row+" Employee");
			System.out.println("Enter the Employee Id");
			int identity=sc.nextInt();
			id[row]=identity;

			System.out.println("Enter the Employee Name");
			System.out.println();
			String employeeName=sc.next();
			name[row]=employeeName;
		
		
			System.out.println("Enter the Employee Designation");
			String employeeDesg= sc.next();
			desg[row]=employeeDesg;
		
		
			System.out.println("Enter the Employee Salary");
			double employeeSalInitial=sc.nextDouble();
			double pf=employeeSalInitial*5/100;
			double da=employeeSalInitial*7/100;
			double hra=employeeSalInitial*10/100;
			double employeeSal=hra + da - pf;
			employeeSal=employeeSal+employeeSalInitial;

			if (desg.equals("Manager"))
			 {
				salary[row]=employeeSalInitial+employeeSal*15/100;
			 }
			 else if (desg.equals("Developer"))
			 {
				salary[row]=employeeSalInitial+employeeSal*10/100;
			 }else
				
				salary[row]=employeeSalInitial+employeeSal*5/100;
		}

			for (int row=0;row<rec;row++)
			{
				System.out.println("Employee "+row+" Record");
				System.out.println( "ID of employee =" + id [row]);
				System.out.println("Name of employee =" + name [row] );
				System.out.println( "Salary of employee =" + salary[row]);
				System.out.println( "Desiganation of employee =" + desg [row] );

		    }

	}
}
