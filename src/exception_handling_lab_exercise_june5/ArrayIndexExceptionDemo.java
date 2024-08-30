package exception_handling_lab_exercise_june5;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {
public static void main(String[] args) {
	try
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st number-");
	int a=sc.nextInt();
	System.out.print("Enter 2nd number-");
	int b=sc.nextInt();
	System.out.print("Enter 3rd number-");
	int c=sc.nextInt();
	
	int arr[]=new int[] {a,b,c};
	System.out.println(arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e);
	}
}
}
