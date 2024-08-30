package string_type_program_june30;

import java.util.Scanner;

public class CountNumberOfOccurrence {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String givenString=sc.nextLine().toLowerCase();
		char given_array[]=givenString.toCharArray();
		int occ[]=new int[given_array.length];
		for(int i=0;i<given_array.length;i++)
		{
			int count=1;
			for(int j=i+1;j<given_array.length;j++)
			{
				if(given_array[i]==given_array[j]&&given_array[i]!='*')
				{
				   given_array[j]='*';
				   count++;
				}
				
			}
			occ[i]=count;
		}
		for(int i=0;i<given_array.length;i++)
		{
		   if(given_array[i]!='*')
		   {
			   System.out.println(given_array[i]+"--"+occ[i]);
		   }
		}
	
}
	
}

