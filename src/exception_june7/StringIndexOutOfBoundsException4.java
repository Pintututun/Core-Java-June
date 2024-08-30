package exception_june7;

public class StringIndexOutOfBoundsException4 {
public static void main(String[] args) {
	checkException();
}
static void checkException()
{ 
 try
 {
String Str = "Hello World";
System.out.println(Str.length());
char c=Str.charAt(0);
c=Str.charAt(40);
System.out.println(c);
}
catch(StringIndexOutOfBoundsException s)
{ 
System.out.println("String Index Out Of Bounds Exception !");
}
}
}
