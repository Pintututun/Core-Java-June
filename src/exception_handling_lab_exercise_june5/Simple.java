package exception_handling_lab_exercise_june5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.print("Enter 1st number-");
		int a=sc.nextInt();
		try 
		{
			System.out.println("Enter 2nd number");
			int b=sc.nextInt();
		}
		catch(InputMismatchException e2)
		{
			System.out.println(e2.getMessage());
			e2.printStackTrace();
			System.out.println(e2);
		}
		}
		catch(InputMismatchException e1)
		{
			System.out.println(e1.getMessage());
			e1.printStackTrace();
			System.out.println(e1);
			
		}
		
		 finally { System.out.println("Program ended"); }
	}
}
