package array_type_program_june19;

import java.util.Arrays;
import java.util.Scanner;

public class MovingZero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements:");
	int num=sc.nextInt();
	int []arr=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.print("Enter "+(i+1)+" element");
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Elements after moving zero to left");
	
	System.out.println(Arrays.toString(leftShift(arr)));
	
}
public static int[] leftShift(int[] a)
{
	int[] change=new int[a.length]; 
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]==0)
		{
			count++;
		}
	}
	int k;
	for( k=0;k<count;k++)
	{
		change[k]=0;
	}
	for(int t=0;t<a.length;t++)
	{
		if(a[t]!=0)
		{
			change[k]=a[t];
			k++;
		}
	}
	return change;

}
}