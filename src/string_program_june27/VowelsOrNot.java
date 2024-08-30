package string_program_june27;

import java.util.Scanner;

public class VowelsOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	int notVowel=1;
	for(char c:givenString.toLowerCase().toCharArray())
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("String contains vowel");
			notVowel=1;
			break;
		}
		else
		{
		    notVowel=0;
		}
	}
	if(notVowel==0)
	{
		System.out.println("String does not contain vowel");
	}
}
}
