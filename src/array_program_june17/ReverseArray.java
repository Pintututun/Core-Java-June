package array_program_june17;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
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
	if(num%2!=0)
	{
	for(int i=0,temp;i<=arr.length/2;i++)
	{
		temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
	}
	System.out.println(Arrays.toString(arr));
	}
	else
	{
		for(int i=0,temp;i<=arr.length/2-1;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
}
