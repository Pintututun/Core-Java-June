package array_type_program_june_21;

import java.util.Scanner;

public class ReverseOrder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements");
	int num=sc.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr[i]=sc.nextInt();
	}
	System.out.println("Numbers in reverse order-");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
}
}
