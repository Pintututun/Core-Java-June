package array_type_program_june23;

import java.util.Scanner;

public class UniqueElements {
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
	unique(arr);
}
public static void unique(int []a)
{
	boolean []b=new boolean[a.length];
	int i;
	for( i=0;i<a.length-1;i++)
	{
	int count=1;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j]&&a[i]!=-1)
			{
				a[j]=-1;
				b[j]=true;
				count++;
			}
			
		}
		if(count>1||a[i]==-1)
		{
			b[i]=true;;
		}
		else {
			b[i]=false;
		}
	}
	
	for(int k=0;k<a.length;k++)
	{
		if(b[k]==false)
		{
			System.out.print(a[k]+" ");
		}
	}
}
}
