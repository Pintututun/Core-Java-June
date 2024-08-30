package exception_june7;

class Parent1
{
	public void get() throws Exception
	{
		System.out.println("I am parent class method");
	}
}
class Sub1 extends Parent1
{
	public void get() throws ArithmeticException
	{
		System.out.println("I am child class method");
	}
}
public class Main1 {
public static void main(String[] args) throws Exception {
	Parent1 pa=new Parent1();
	Parent1 su=new Sub1();
	try
	{
	pa.get();
	}
	catch(Exception e1)
	{
		e1.printStackTrace();
	} 
	try
	{
		su.get();
	}
	catch(ArithmeticException e2)
	{
		e2.printStackTrace();
	}
}
}
