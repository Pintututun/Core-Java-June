package string_type_program;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine().toLowerCase();
	char []new_array=givenString.toCharArray();
	int i,c;
	for( i=0,c=1;i<new_array.length/2;i++)
	{
		if(new_array[i]==new_array[new_array.length-i-1])
		{
			c=0;
		}
		else
		{
			c=1;
			break;
					
		}
	}
	if(c==0)
	{
		System.out.println("It is Palindrome");
	}
	else
	{
		System.out.println("It is not Palindrome");
	}
}
}
