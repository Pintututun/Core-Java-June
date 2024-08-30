package array_type_program_june20;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateElements {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements:");
	int num=sc.nextInt();
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	String duplicate="";
	for(int i=0,temp=-32767;i<num-1;i++)
	{
		if(arr[i]==arr[i+1]&&arr[i]!=temp)
		{
			duplicate=duplicate+arr[i]+"   ";
			temp=arr[i];
			i++;
		}
	}
	System.out.println("Duplicate elements are "+duplicate);
}
}
