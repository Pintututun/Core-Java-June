package exception_handling_lab_exercise_june5;

public class IllegalStateExceptionDemo {
	public static void throwIllegalException()
	{
		try
		{
			throw new IllegalStateException("My Exception");
		}
		catch(IllegalStateException objA)
		{
			System.out.println("caught:"+objA);
		}
	}
public static void main(String[] args) {
	throwIllegalException();
}
}
