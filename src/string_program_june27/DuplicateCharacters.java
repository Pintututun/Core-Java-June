package string_program_june27;

import java.util.Scanner;

public class DuplicateCharacters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine().toLowerCase();
	char []character=givenString.toCharArray();
	int []duplicate=new int[character.length];
	for(int i=0;i<character.length;i++)
	{
		int count=1;
		for(int j=i+1;j<character.length;j++)
		{
			if(character[i]==character[j])
			{
				character[j]='*';
				count++;
			}
		}
		duplicate[i]=count;
	}
	System.out.println("Characters---Occurence");
	for(int i=0;i<duplicate.length;i++)
	{
		if(character[i]!='*'&&duplicate[i]>1)
		{
			System.out.println(character[i]+"\t\t"+duplicate[i]);
		}
	}
}
}
