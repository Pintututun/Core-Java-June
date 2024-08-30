package string_type_program_june30;

import java.util.Scanner;

public class CountNumberOfWordsWithoutUsingPredefined {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine();
	char given_array[]=givenString.toCharArray();  
	int word=1;
	int i;
	for( i=0;i<given_array.length-1;i++)
	{
		if((given_array[i]!=' ')&&(given_array[i+1]==' '))
		{
			word++;
		}
	}
	//if(given_array[0]==' ')word--;
	if(given_array[i]==' ')word--;
	System.out.println(word);
}
}
