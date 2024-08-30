package string_type_program;

import java.util.Scanner;

public class CheckNonRepeatedCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine().toLowerCase();
	char givenCharacter[]=givenString.toCharArray();
	int occ[]=new int[givenCharacter.length];
	for(int i=0;i<givenCharacter.length;i++)
	{
		int count=1;
		for(int j=i+1;j<givenCharacter.length;j++)
		{
			if(givenCharacter[i]==givenCharacter[j]&&givenCharacter[i]!='*')
			{
				givenCharacter[j]='*';
				count++;
			}
		}
		occ[i]=count;
	}
	for(int i=0;i<occ.length;i++)
	{
		if(occ[i]==1&&givenCharacter[i]!='*')
		{
			System.out.println(givenCharacter[i]);
		}
	}
	
}
}
