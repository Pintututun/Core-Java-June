package exception_june7;

public class MyAutoClosable implements AutoCloseable {
public static void main(String[] args) {
	MyAutoClosable m=new MyAutoClosable();
	try(m)
	{
		m.display("I am PINTU");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}
	@Override
	public void close() throws Exception {
		System.out.println("AutoCloseable is executed");

	}
	public void display(String str)
	{
		if(str!=null)
		{
			throw new RuntimeException("Run time exception is executed");
		}
		else
		{
			System.out.println("yeh,I dont have exception");
		}
	}

}
