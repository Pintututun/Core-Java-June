package exception_handling_program_june6;

public class A87 {
	 public static void main(String[] argv) 
	  {
	    try 
	    {
	      throw new OutOfMemoryError();
	     // System.out.println("Success");
	    }
	    catch (Error e) 
	    {
	      System.out.println("General exception");
	    } 
	    finally
	    {
	      System.out.println("Doing finally part");
	    }
	    System.out.println("Carrying on");

	  }
}
