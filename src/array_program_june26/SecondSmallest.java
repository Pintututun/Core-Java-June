package array_program_june26;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
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
	Arrays.sort(arr);
	int changedArr[]=new int[arr.length];
	int k,t;
	for( k=0,t=0;k<arr.length-1;k++)
	{
		if(arr[k]!=arr[k+1])
		{
			changedArr[t]=arr[k];
			t++;	
		}
		
	}
	changedArr[t]=arr[arr.length-1];
	int[] new_array=Arrays.copyOf(changedArr,t+1);
	System.out.println("Second smallest :"+new_array[1]);
}
}
