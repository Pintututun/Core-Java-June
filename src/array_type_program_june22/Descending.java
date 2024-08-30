package array_type_program_june22;

import java.util.Arrays;
import java.util.Scanner;

public class Descending {
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
	descendingOrder(arr);
}
public static void descendingOrder(int[] a)
{
	
	for(int i=0;i<((a.length)-1);i++)
	{
		for(int j=i+1,temp=0;j<(a.length);j++)
		{
			
			if(a[i]<a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println("Descending order:"+Arrays.toString(a));
}
}

