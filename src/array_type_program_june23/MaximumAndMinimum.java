package array_type_program_june23;

import java.util.Scanner;

public class MaximumAndMinimum {
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
   check(arr);
}
public static void check(int []a)
{
	int min=a[0];
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Minimum element is:"+min);
	System.out.println("Maximum element is:"+max);
}
}
