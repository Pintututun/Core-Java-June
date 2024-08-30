package string_type_program_june30;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	StringBuilder new_string=new StringBuilder();
	new_string.append(givenString.charAt(givenString.length()-1));
	for(int i=1;i<givenString.length()-1;i++)
	{
		new_string.append(givenString.charAt(i));
	}
	new_string.append(givenString.charAt(0));
	System.out.println("New String after swap:"+new_string);

}
}
