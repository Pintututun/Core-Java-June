package array_type_program_june22;

import java.util.Arrays;
import java.util.Scanner;

public class InsertValueInPosition {
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
	System.out.print("Enter the element you want to insert:");
	int newValue=sc.nextInt();
	System.out.print("Enter the position you want to insert:");
	int position=sc.nextInt();
	insert(arr,newValue,position);
	
}
public static void insert(int[] a,int number,int pos)
{
	int[] neAr=Arrays.copyOf(a, a.length+1);
	int i;
	for( i=neAr.length-1;i>pos-1;i--)
	{
		neAr[i]=neAr[i-1];
	}
	neAr[i]=number;
	System.out.println(Arrays.toString(neAr));
}
}
