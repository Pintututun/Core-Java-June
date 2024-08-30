package array_type_program_june19;

import java.util.Arrays;

public class SeparatePositiveAndNegativeNumber {
	static int positive=0;
	static int negative=0;
public static void main(String[] args) {
	int arr[]= {9,10,-18,20,-27,30,-36,40,45,50};
	for(int data:arr)
	{  
		
		if(data>0)
		{
			positive=positive+1;
		}
		if(data<0)
		{
			negative=negative+1;
		}
		
		
	}
	System.out.println("Positive number:"+positive);
	System.out.println("Positive array:"+Arrays.toString(separateArray(arr,positive)));
	System.out.println("Negative number:"+negative);
	System.out.println("Negative array:"+Arrays.toString(separateArray(arr,negative)));
}
public static int[] separateArray(int[] a,int len)
{
	
	if(len==positive)
	{
		
	int []pos=new int[len];
	int k=0;
	for(int j=0;j<a.length;j++)
	{
		if(a[j]>0)
		{
		 pos[k]=a[j];
		 k++;
		}
	}
	return pos;
	}
	else
	{
		int []neg=new int[len];
		int m=0;
		for(int t=0;t<a.length;t++)
		{
			if(a[t]<0)
			{
				neg[m]=a[t];
				m++;
			}
		}
		return neg;
	}
}
}
