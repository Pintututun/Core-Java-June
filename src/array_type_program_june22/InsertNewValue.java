package array_type_program_june22;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNewValue {
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
	System.out.print("Enter the element you want to insert:");
	int newValue=sc.nextInt();
	
	insertValue(arr,newValue);
}
     
	 public static void insertValue(int[] array, int newValue) {
	        int[] newArray = new int[array.length + 1];
	        int i = 0;

	        while (i < array.length && array[i] < newValue) {
	            newArray[i] = array[i];
	            i++;
	        }

	        newArray[i] = newValue;

	        while (i < array.length) {
	            newArray[i + 1] = array[i];
	            i++;
	        }

	        System.out.println( Arrays.toString(newArray));
	 
	 }

}
