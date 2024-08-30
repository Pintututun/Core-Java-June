package array_type_program_june19;

import java.util.Scanner;

public class ArrRepeat {
public static void main(String[] args) {
	System.out.print("Enter the number of elements want to enter:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int []arr=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter the "+(i+1)+" element");
		arr[i]=sc.nextInt();
	}
	System.out.print("Enter the element want to check if that element occurs more than "+num/2+"--");
    int givenNumber=sc.nextInt();
	System.out.println(isOccurMoreThanHalfTimes(arr,givenNumber));
  
}
public static boolean isOccurMoreThanHalfTimes(int []ar,int n)
{
	int count=0;
	for(int j=0;j<ar.length;j++)
	{
		if(ar[j]==n)
		{
			count++;
		}
	}
		if(count>ar.length/2)
		{
			return true;
		}
		else
		{
			return false;
		}
	
}
}
