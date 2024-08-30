package string_program_june27;

import java.util.Scanner;

public class CountOccurrenceOfCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine().toLowerCase();
	System.out.print("Enter a character to check:");
	char givenCharacter=sc.next().charAt(0);
	int count=0;
	for(int i=0;i<givenString.length();i++)
	{
		if(givenString.charAt(i)==givenCharacter)
		{
			count++;
		}
	}
	System.out.println("The character "+givenCharacter+" has occured "+count+" times");
}
}
