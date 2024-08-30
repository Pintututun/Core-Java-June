package exception_june7;

public class MultipleCatch1 {
	public static void main(String[] args) {
		MultipleCatch1 mul=new MultipleCatch1();
		mul.multiCatch();
	}
public void multiCatch()
{
	int a[]=new int[2];
	try
	{
		a[4]=10/2;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
}
}
