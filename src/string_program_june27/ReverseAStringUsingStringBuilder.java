package string_program_june27;

import java.util.Scanner;

public class ReverseAStringUsingStringBuilder {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a string:");
	StringBuilder sb=new StringBuilder(sc.nextLine());
	System.out.println(sb.reverse());
}
}
