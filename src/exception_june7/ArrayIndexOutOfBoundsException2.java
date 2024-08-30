package exception_june7;

public class ArrayIndexOutOfBoundsException2 {
public static void main(String[] args) {
	try
	{
	int a[]=new int [50];
	a[6]=20;
	}
	catch (ArrayIndexOutOfBoundsException a)
	{
	System.out.println("Array Index Out Of Bounds");
	}
	System.out.println("Main method ended");
	}

}

