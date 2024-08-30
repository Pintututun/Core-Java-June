package exception_handling_program_june6;

public class ExceptionTest {
	public static void main(String[] args) 
	{
	    Exception e1 = new ArithmeticException("Number is divided by zero");
		System.out.println(e1);

         Exception e2 = new ArrayIndexOutOfBoundsException("Array is out of limit");
		System.out.println(e2);

	}
}
