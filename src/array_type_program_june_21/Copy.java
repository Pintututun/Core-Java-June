package array_type_program_june_21;

import java.util.Arrays;
import java.util.Scanner;

public class Copy {
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
	int[] new_array=Arrays.copyOf(arr, num);
	System.out.println("Copied array is:"+Arrays.toString(new_array));
}
}
