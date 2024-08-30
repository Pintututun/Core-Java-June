package array_type_program_june20;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of elements:");
	int num=sc.nextInt();
	int []arr=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.print("Enter "+(i+1)+" element:");
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("Third Largest element:"+arr[arr.length-3]);
}
}
