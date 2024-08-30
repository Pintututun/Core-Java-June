package string_type_program_june30;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberOfWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	String givenString=sc.nextLine().toLowerCase().trim();
    givenString=givenString.replace(","," ");
    String []arrStr=givenString.split("\\s");
    System.out.println(Arrays.toString(arrStr));
    System.out.println(arrStr.length);    
	
	
}
}
