package array_type_program_june20;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Student name:");
	String name=sc.nextLine();
	System.out.print("Enter the total number of subjects:");
	int totalNoSubjects=sc.nextInt();
	int []arr=new int[totalNoSubjects];
    for(int i=0;i<totalNoSubjects;i++)
    {
    	System.out.print("Enter the marks of "+(i+1)+" subject");
    	int mark=sc.nextInt();
    	if(mark>40)
    	{
    		arr[i]=mark;
    	}
    	else
    	{
    		System.out.println("Enter the correct mark above passing mark");
    		i--;
    	}
    }
    int sum=0;
    for(int eachMark:arr)
    {
    	sum=sum+eachMark;
    }
    double average=sum/totalNoSubjects;
    System.out.println("Total marks-"+sum+" and Average-"+average);
    
}
}
