package string_program_june27;

import java.util.Scanner;

public class RemoveSpecifiedCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	char []character=givenString.toCharArray();
	System.out.print("Enter a character to remove:");
	char removeChar=sc.next().charAt(0);
	StringBuilder result=new StringBuilder();
	for(int i=0;i<character.length;i++)
	{
		if(removeChar!=character[i])
		{
			result.append(character[i]);
		}
	}
	System.out.println(result);
}
}
