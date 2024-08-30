package exception_june7;

class Parent {
public void get() {
	System.out.println("I am parent class method");
}
}
class Sub extends Parent{
	@Override
	public void get()throws ArithmeticException
	{
		
		System.out.println("I am sub class method");
	}
}
public class Main{
	public static void main(String[] args) {
		Parent pa=new Parent();
		pa.get();
	Parent su=new Sub();
	su.get();
	}
}