package array_type_program_june22;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAnElement {
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
	System.out.print("Enter the position you want to delete:");
	int position=sc.nextInt();
	deleteElement(arr,position);
}
public static void deleteElement(int []a,int pos)
{
	int[] newAr=Arrays.copyOf(a, a.length-1);
	for(int i=pos-1;i<newAr.length;i++)
	{
			newAr[i]=a[i+1];
		
	}
	System.out.println(Arrays.toString(newAr));
}
}
