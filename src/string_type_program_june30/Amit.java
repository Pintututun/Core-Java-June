package string_type_program_june30;

import java.util.Scanner;

public class Amit {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(j)==' ' || j==s.length()-1)
					{
						c++;
						i=j;
						break;
					}
				}
			}
		}
		System.out.println(c);

	}

}
