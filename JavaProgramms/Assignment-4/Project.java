import java.util.Scanner;

class Employee
{
	int id;
	String name;
	Address add = new Address();
	double salary;
	Scanner obj=new Scanner(System.in);
	static int count=0,count2=0;
	void read()
	{
		if(count==0){
				System.out.println("Employee Manager Record");	
			}
			else{
				System.out.println("Employee programer Record");
			}
			count++;

	System.out.println("Enter id of employee =");
	id=obj.nextInt();
	System.out.println("Enter name of employee =");	
	name=obj.next();
	System.out.println("Enter Salary of employee =");
	salary=obj.nextDouble();
	}
	void calSalary()
	{
			double pf,hra,da;
			hra=salary*10/100;
			da=salary*7/100;
			pf=salary*5/100;
			salary= salary+hra+da-pf;	
		}
	
	void display()
	{
			if(count2==0){
				System.out.println("Employee Manager Record");	
			}
			else{
				System.out.println("Employee programer Record");
			}
			count2++;
			System.out.println("ID of employee "+id);
			System.out.println("Name of employee "+name);
			System.out.println("Salary of employee "+salary);
	}
}
class Address
{
	String city,state;
	long pin;
	Scanner obj = new Scanner(System.in);
	void readAddress(){
			System.out.println("Enter your city name ");
			city = obj.next();
			System.out.println("Enter State ");
			state = obj.next();	
			System.out.println("Enter the Pincode ");
			pin = obj.nextLong();
	}
	void disAddress(){
		
			System.out.println("City of employee"+city);
			System.out.println("State of employee "+state);
			System.out.println("pincode "+pin);
		
	}
} 

class Manager extends Employee
{
	int numberOfEmp;
	
	void readMgr()	
	{
	System.out.println("Enter the Number of Employees under the manager ");
	numberOfEmp=obj.nextInt();
	}
	void disMgr()	
	{
		display();
		add.disAddress();
		System.out.println("Number of Employee under the manager "+numberOfEmp);

	}
}
class Programmer extends Employee
{
	String projectName;

	void readProg()	
	{
		read();
		add.readAddress();
		System.out.println("Enter the project name =");
		projectName = obj.next();
	}
	void dispProg()	
	{
		display();
		add.disAddress();
		System.out.println("Project name="+projectName);
	}
}


class Project
{
public static void main(String args[]){
		
		Manager mang = new Manager();
		Programmer prog = new Programmer();
		mang.readMgr();
		prog.readProg();
		mang.disMgr();
		prog.dispProg();
		


}

}



