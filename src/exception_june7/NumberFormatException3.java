package exception_june7;

public class NumberFormatException3 {
public static void main(String[] args) {
	NumberFormatException3 ex=new NumberFormatException3();
	ex.checkException();
}
void checkException()
{
try
{
int num=Integer.parseInt("xyz");
System.out.println(num);
}
catch (NumberFormatException e)
{
System.out.println("Number Format Exception Occured");
}
}
}
