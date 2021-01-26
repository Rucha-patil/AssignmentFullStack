class MyException extends Exception{
   MyException(){
    super();
   
   }
   MyException(String msg){
     super(msg);
	 System.out.println("hiii");
   }

}
class ExpDemo{
   public static void main(String args[]){
    int a=10;
int b=5;
try{
  if (a>b)
  {
	  throw new MyException("a is less than b");
	  
  }
  else{}
}	
catch(Exception e)
{
	 System.out.println("I am catch block");
	 System.out.println(e.toString());
}
   System.out.println("Normal statement");
}

}