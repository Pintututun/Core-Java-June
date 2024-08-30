package array_type_program_june19;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteDuplicate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements:");
	int num=sc.nextInt();
	int arr[]=new int[num];
	for(int k=0;k<arr.length;k++)
	{
		System.out.println("Enter the "+(k+1)+" element");
		arr[k]=sc.nextInt();
	}
	System.out.println("After removing duplicates:");
	System.out.println(Arrays.toString(findAndRemoveDuplicate(arr)));
	
}
public static int[] findAndRemoveDuplicate(int []a)
{
	
	for(int i=0;i<a.length-1;i++)
	{
		int c=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j]&&a[j]!=-1)
			{
				a[j]=-1;
			}
		}
		
	}
	int count=0;
	for(int data:a)
	{
		if(data!=-1)
		{
			count++;
		}
	}
	int[] changeArr=new int[count];
	for(int k=0,t=0;k<a.length&&t<count;k++)
	{
		if(a[k]!=-1)
		{
			changeArr[t]=a[k];
			t++;
		}
	}
	return changeArr;
}
}
