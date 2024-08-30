package string_program_june27;

import java.util.Arrays;
import java.util.Scanner;

public class SortAString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	char []character=givenString.toCharArray();
	for(int i=0;i<character.length-1;i++)
	{
		for(int j=i+1;j<character.length;j++)
		{
			if(character[i]>character[j])
			{
				char temp=character[i];
				character[i]=character[j];
				character[j]=temp;
				
			}
		}
	}
	for(char c:character)
	{
		System.out.print(c);
	}
}
}
