package useof_try_catch_finally_june9;

public class ExcepProgram06 {
	public static void main(String[] args) 
	{
	System.out.println("main start"); 
	System.out.println(m1()); 
	System.out.println("main end");
	}
	static public int m1() 
	{
	   try 
	   {
	     System.out.println("In try"); 
	     return 10;
	   }
	      catch(ArithmeticException e) 
	       { 
	          System.out.println("In catch"); 
		  return 20;
	       }
	       finally 
	       {
	          System.out.println("In finally");
		  return 30;
	       }
	}
}

