package array_program_june26;

import java.util.Arrays;
import java.util.Scanner;

public class Print2DMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of rows");
	int row=sc.nextInt();
	System.out.print("Enter the number of columns");
	int col=sc.nextInt();
	int arr[][]=new int[row][col];
	for(int i=0;i<row;i++)
	{
		
		System.out.print("For "+(i+1)+" row:");
		for(int j=0;j<col;j++)
		{
		System.out.print("Enter "+(j+1)+" column element:");
		arr[i][j]=sc.nextInt();
	
		}
	}
	System.out.println(Arrays.deepToString(arr));
}
}
