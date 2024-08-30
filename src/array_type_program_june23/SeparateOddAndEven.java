package array_type_program_june23;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateOddAndEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements");
	int num=sc.nextInt();
	int arr[]=new int[num];
	int even=0;
	int odd=0;
	for(int i=0;i<num;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr[i]=sc.nextInt();
		if(arr[i]%2==0)
		{
			even=even+1;
		}
		else
		{
			odd=odd+1;
		}
	}
	separate(arr,even,odd);
}
public static void separate(int []a,int evenNum,int oddNum)
{
	int []evenArray=new int[evenNum];
	int []oddArray=new int[oddNum];
	for(int i=0,e=0,o=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			evenArray[e]=a[i];
			e++;
		}
		else
		{
			oddArray[o]=a[i];
			o++;
		}
	}
	System.out.println("Even array is:"+Arrays.toString(evenArray));
	System.out.println("Odd array is:"+Arrays.toString(oddArray));
}
}
