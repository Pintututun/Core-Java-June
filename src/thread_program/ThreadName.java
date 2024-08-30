package thread_program;

public class ThreadName {

	public static void main(String[] args)
	{
		   Thread currentThread = Thread.currentThread();
		    String name = currentThread.getName();
		    System.out.println("Current Thread Name is :"+name);
		   

	}

}

