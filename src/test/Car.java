package test;
class Engine //Has A relationship 
{
	public void start() 
	{
		System.out.println("Started:");
	}

	public void stop() 
	{
		System.out.println("Stopped:");
	}
}
class Maserati
{
	public void MaseratiStartDemo() 
	{
		Engine ob = new Engine();
		ob.start();
		ob.stop();
	}
}
public class Car 
{
	public static void main(String[] args) 
	{
		Maserati ob1 = new Maserati();
		ob1.MaseratiStartDemo();
	}
}



