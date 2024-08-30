package string_type_program;

import java.util.Scanner;

public class SwapFirstAndLast {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	StringBuilder new_String=new StringBuilder();
	new_String.append(givenString.charAt(givenString.length()-1));
	for(int i=1;i<givenString.length()-1;i++)
	{
		new_String.append(givenString.charAt(i));
	}
	new_String.append(givenString.charAt(0));
	System.out.println(new_String);
}
}
