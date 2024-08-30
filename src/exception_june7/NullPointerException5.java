package exception_june7;

public class NullPointerException5 {
	public static void main(String[] args) {
		checkException();
	}
	static void checkException() 
	{
	try
	{
	String str=null;
	System.out.println(str.length());
	}
	catch(NullPointerException e)
	{
	System.out.println("Null Pointer Exception");
	}
	}
}
