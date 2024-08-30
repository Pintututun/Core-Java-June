package array_type_program_june_21;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements:");
	int num=sc.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.print("Enter "+(i+1)+" element:0");
		arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int x:arr)
	{
		sum=sum+x;
	}
	System.out.println("Sum is"+sum);
}
}
