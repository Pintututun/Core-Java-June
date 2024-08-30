package exception_june7;

public class MultipleCatch2 {
public static void main(String[] args) {
	MultipleCatch2 mul=new MultipleCatch2();
	mul.multiCatch(1);
}
public void multiCatch(int num)
{
	try
	{
		if(num==1)
		{
			int arr[]=new int[4];
			arr[6]=20;
		}
		else if(num==2)
		{
			int div=10/0;
		}
		else if(num==3)
		{
			int number=Integer.parseInt("ABC");
		}
		else
		{
			throw new NullPointerException("Your choice is wrong");
		}
	}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException|NumberFormatException|NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
	
}
}
