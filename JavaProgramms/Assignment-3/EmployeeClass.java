import java.util.*;

class EmployeeDetails
{
	int no;
	int id[];
	String name[];
	double salary[];
	String desg[];

	EmployeeDetails(int size){
		this.no=size;
		id=new int[size];
		name=new String[size];
		salary=new double[size];
		desg=new String[size];
		
	}
void read(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all the Employees Record here");
		for(int row=0; row<no; row++){
			System.out.println("Enter Employee "+(row+1)+" record");

			System.out.println("Enter id of employee");
			id[row] = sc.nextInt();

			System.out.println("Enter name of employee ");
			name[row] = sc.next();	

			System.out.println("Enter Salary of employee");
			salary[row] = sc.nextDouble();

			System.out.println("Enter desiganation of employee ");
			desg[row] = sc.next();
		}

	}
void calculateSalary(){
		double bonus,pf,hra,da;
		for(int row =0;row<no;row++){
			if(desg[row].equals("Manager")){
				bonus=salary[row]*15/100;
			}else if(desg[row].equals("Developer")){
				bonus=salary[row]*10/100;
			}else{
				bonus=salary[row]*5/100;
			}
			hra=salary[row]*10/100;
			da=salary[row]*7/100;
			pf=salary[row]*5/100;
			salary[row]= salary[row]+hra+da+bonus-pf;	
		}

	}
	void displayDetails(){
		for(int row =0;row<no;row++){
			System.out.println("Employee"+(row+1)+" Record");
			System.out.println("ID of employee ="+id[row]);
			System.out.println("Name of employee ="+name[row]);
			System.out.println("Salary of employee ="+salary[row]);
			System.out.println("Desiganation of employee ="+desg[row]);
		}
	}

}


class EmployeeClass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records which you want to save");
		int size = sc.nextInt();
		EmployeeDetails empObj = new EmployeeDetails(size);
		empObj.read();
		empObj.calculateSalary();
		empObj.displayDetails();
	}
}





































