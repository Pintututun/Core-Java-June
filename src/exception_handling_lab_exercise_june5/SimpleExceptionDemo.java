package exception_handling_lab_exercise_june5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
public static void main(String[] args) {
	try
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st number-");
	int a=sc.nextInt();
	System.out.print("Enter 2nd number-");
	int b=sc.nextInt();
	if((a>=0&&a<=9)&&(b>=0&&b<=9))
	{
		System.out.println("Program executed");
	}
	else
	{
		throw new InputMismatchException("Dont pass value smaller than zero or greater than 9");
	}
	}
	catch(InputMismatchException e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
		System.out.println(e);
		
	}
	finally
	{
		System.out.println("Program ended");
	}
}
}
