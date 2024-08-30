package array_type_program_june23;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements of 1st array:");
	int num1=sc.nextInt();
	int arr1[]=new int[num1];
	for(int i=0;i<num1;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr1[i]=sc.nextInt();
	}
	
	System.out.print("Enter the number of elements of 2nd arrays:");
	int num2=sc.nextInt();
	int arr2[]=new int[num2];
	for(int i=0;i<num2;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr2[i]=sc.nextInt();
	}
	merge(arr1,arr2);
}
public static void merge(int []a,int []b)
{
	int []mergedArray=new int[a.length+b.length];
	int i;
	for( i=0;i<a.length;i++)
	{
		mergedArray[i]=a[i];
	}
	for(int k=0;k<b.length;k++,i++)
	{
		mergedArray[i]=b[k];
	}
	descendingOrder(mergedArray);
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
