abstract class AccountInitialization
{
Account accounts[]=new Account[10];
	static int accountCount=0;
	

	void accountCreate() {
					 
					name =”Unknown”
					amount =500;
		Account ac = new Account(accno,Unknown,500);
		accounts[acountCount];
		accountCount++;			
}

 


}

interface Bank
{
	void withdraw();
	
	void deposit();
	
	void checkBalance();

}

class MyBank implements Bank
{  
	Account acc[]=new Account[10];

	void withdraw(accNo,amount)
	{
	
	}
	void deposit(accNo,amount)
	{
	
	}
	void checkBalance(accNo)
	{
	
	}

}
class Account
{
	private int accNo;
	private String name;
	private double amount;
	Account(int accNum,String name,double amount)
		{
	accNo=this.accNum;
	name=this.name;
	amount=this.amount;
	
	
	}
}


class BankApplication
{
  int a=
 do
 {
	 int a,b;
	 Scanner obj=new Scanner(System.in);
		
	 System.out.println("1. Create Account");
	 System.out.println("2. Check Account Balance");
	 System.out.println("3. Withdraw the amount");
	 System.out.println("4. Deposit");
	 System.out.println("5. Transfer");
	 a=obj.nextInt();
switch (a)
{
case 1:{
		 System.out.println("Choose your option /n 1. Deafult Details /n 2.Name and Amount");
			b=obj.nextInt;
			switch (b)
			{
			case 1:{
				System.out.println("Default details");
			}
			case 2:{
				System.out.println("Name and Amount");
			}
			
			}
		

}
case 2:{
	System.out.println("Checking Account Balance");

}
case 3:{
	System.out.println("Withdraw your amount");

}
case 4:{
	System.out.println("Deposit");
}
case 5:{
	System.out.println("Transfer your amount");
}

}


 }
 while ();{}

}