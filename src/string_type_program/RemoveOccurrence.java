package string_type_program;

import java.util.Scanner;

public class RemoveOccurrence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	System.out.print("Enter a character to remove:");
	char givenCharacter=sc.next().charAt(0);
	char []new_array=givenString.toCharArray();
	StringBuilder new_string=new StringBuilder();
	for(int i=0;i<new_array.length;i++)
	{
		if(givenCharacter==new_array[i])
		{
			new_string.append(new_array[i]);
			for(int j=i+1;new_array[j]!=givenCharacter;j++)
			{
				
				new_string.append(new_array[j]);
				if(j==new_array.length-1)
				{
					break;
				}
			}
			break;
		}
		else
		{
			new_string.append(new_array[i]);
		}
	}
	System.out.println(new_string);
}
}
