package string_type_program_june30;

import java.util.Scanner;

public class RemoveAllOccurenceOfAGivenCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine().toLowerCase();
	System.out.print("Enter a character to remove:");
	char givenCharacter=sc.next().charAt(0);
	StringBuilder new_string=new StringBuilder();
	for(int i=0;i<givenString.length();i++)
	{
		if(givenString.charAt(i)!=givenCharacter)
		{
			new_string.append(givenString.charAt(i));
		}
	}
	System.out.println(new_string);
}
}
