package array_type_program_june22;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
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
	ascendingOrder(arr);
}
public static void ascendingOrder(int[] a)
{
	
	for(int i=0;i<((a.length)-1);i++)
	{
		for(int j=i+1,temp;j<a.length;j++)
		{
			
			if(a[i]>a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	System.out.println("Ascending order:"+Arrays.toString(a));
}
}
