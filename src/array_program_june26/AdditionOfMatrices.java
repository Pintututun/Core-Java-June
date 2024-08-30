package array_program_june26;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfMatrices {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of rows");
	int row=sc.nextInt();
	System.out.print("Enter the number of columns");
	int col=sc.nextInt();
	int arr1[][]=new int[row][col];
	int arr2[][]=new int[row][col];
	int sum[][]=new int[row][col];
	System.out.println("For 1st matrix:");
	for(int i=0;i<row;i++)
	{
		
		System.out.print("For "+(i+1)+" row:");
		for(int j=0;j<col;j++)
		{
		System.out.print("Enter "+(j+1)+" column element:");
		arr1[i][j]=sc.nextInt();
	
		}
	}
	System.out.println("For 2nd matrix:");
	for(int i=0;i<row;i++)
	{
		
		System.out.print("For "+(i+1)+" row:");
		for(int j=0;j<col;j++)
		{
		System.out.print("Enter "+(j+1)+" column element:");
		arr2[i][j]=sc.nextInt();
	
		}
		
	}
	System.out.println("For Addition:");
	for(int i=0;i<row;i++)
	{	
		for(int j=0;j<col;j++)
		{
		sum[i][j]=arr1[i][j]+arr2[i][j];
		}
		
	}
	System.out.println(Arrays.deepToString(sum));

}
}
