package exception_june7;

public class StackOverFlowErrorDemo {
	static int a;
public static void main(String[] args) {
	display();
}
static void display()
{
	
	  try {
	 
		
System.out.println(" I am StackOverFlow");
a++;
display();
	  }
catch (StackOverflowError e) {
	System.out.println("Stack Over Flow is handled");
	System.out.println("Total number of counts-"+a);
}

}
}
