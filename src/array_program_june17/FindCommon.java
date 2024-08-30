package array_program_june17;

import java.util.Arrays;
import java.util.Scanner;

public class FindCommon {
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
	System.out.print("Enter the number of elements of 2nd array:");
	int num2=sc.nextInt();
	int arr2[]=new int[num2];
	for(int i=0;i<num2;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr2[i]=sc.nextInt();
	}
	int arr3[]=uniqueElement(arr1);
	int arr4[]=uniqueElement(arr2);
	commonElement(arr3,arr4);
}
public static int[] uniqueElement(int a[])
{
	int[] changedArr=new int[a.length];
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int k,t;
	for( k=0,t=0;k<a.length-1;k++)
	{
		if(a[k]!=a[k+1])
		{
			changedArr[t]=a[k];
			t++;	
		}
		
	}
	changedArr[t]=a[a.length-1];
	int[] new_array=Arrays.copyOf(changedArr,t+1);
	
	return new_array;
}
public static void commonElement(int a[],int b[])
{
	System.out.println("Common elements are:");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.print(a[i]+"  ");
				break;
			}
		}
	}
}
}
