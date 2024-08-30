package array_type_program_june19;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateOccurence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements:");
	int num=sc.nextInt();
	int[] arr=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr[i]=sc.nextInt();
	}
	int[] occ=new int[num];
	for(int i=0;i<num;i++)
	{
		int count=1;
		for(int j=i+1;j<num;j++)
		{
			if(arr[i]==arr[j]&&arr[i]!=-1)
			{
				count++;
				arr[j]=-1;
				
			}
			
		}
		occ[i]=count;
		
	}
	System.out.println("Elements\t    Occurence");
	for(int i=0;i<num;i++)
	{
		if(arr[i]!=-1)
		{
			System.out.println("    "+arr[i]+"-----------------"+occ[i]);
		}
	}
	
}
}
