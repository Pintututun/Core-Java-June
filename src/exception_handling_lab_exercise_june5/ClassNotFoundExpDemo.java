package exception_handling_lab_exercise_june5;

public class ClassNotFoundExpDemo {
public ClassNotFoundExpDemo()
{
	Class c;
	try
	{
		c=Class.forName("TestClass");
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
		System.out.println(e);
	}
	
}
public static void main(String[] args) {
	ClassNotFoundExpDemo ct=new ClassNotFoundExpDemo();
}
}
