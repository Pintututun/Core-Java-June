package exception_june7;

public class HandleNullPointerException6 {
public static void main(String[] args) {

	HandleNullPointerException6 h=null;
	try 
	{
	h.display(3);
	}
	catch(NullPointerException n)
	{
		try{
	if(h!=null)
	{
		h=new HandleNullPointerException6();
		h.display(5);
	}
	else
	{
		h.display(8);
	}
		}
		catch(NullPointerException e)
		{
			System.out.println("HandledNullPointerException");
		}
	}
}
public void display(int a)
{
System.out.println(a);
}
}