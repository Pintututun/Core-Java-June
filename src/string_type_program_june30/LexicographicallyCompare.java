package string_type_program_june30;

import java.util.Scanner;

public class LexicographicallyCompare {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st string:");
		String givenString1=sc.nextLine();//sc.nextLine();
		System.out.print("Enter 2nd string:");
		String givenString2=sc.nextLine();
		if(givenString1.length()==givenString2.length())
		{
			
		  if(givenString1.compareTo(givenString2)==0)
		  {
			System.out.println("Lexicographically equal");
		  }
		  else
		  {
			  System.out.println("Lexicographically not equal");
		  }
		}
		 else
		 {
			 System.out.println("Lexicographically not equal");
		 }
		
}
}
