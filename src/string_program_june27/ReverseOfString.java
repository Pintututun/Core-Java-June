package string_program_june27;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	char []character=givenString.toCharArray();
	for(int i=0;i<character.length/2;i++)
	{
		char temp=character[i];
		character[i]=character[character.length-i-1];
		character[character.length-i-1]=temp;
	}
	for(char c:character)
	{
		System.out.print(c);
	}
}
}
