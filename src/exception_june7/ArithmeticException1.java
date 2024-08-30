package exception_june7;

public class ArithmeticException1 {
	public static void main(String[] args) {
		checkException();
	}
	static void checkException()
	{
	try {
	int num1=30,num2=0;
	int operation=num1/num2;
	System.out.println("Result:"+operation);
	}
	catch(ArithmeticException e)
	{
	System.out.println("You Shouldn't divide a number by zero");
	} 
	}
}
