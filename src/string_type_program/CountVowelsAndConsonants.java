package string_type_program;

import java.util.Scanner;

public class CountVowelsAndConsonants {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine().toLowerCase();
	char []new_array=givenString.toCharArray();
	int vowel=0,consonants=0;
	for(int i=0;i<new_array.length;i++)
	{
		switch(new_array[i])
		{
		case 'a': case 'e': case 'i': case 'o': case 'u':vowel++;
		break;
		default : if(new_array[i]>='a'&&new_array[i]<='z')
		{
			consonants++;
		}
		}
	}
	System.out.println("Vowels:"+vowel);
	System.out.println("Consonants:"+consonants);
}
}
