package static_program;

class Test
{
	static int a=10;
	int x=20;
}
class Test1 extends Test
{
	static int a=30;
	int x=40;
}
public class Main {
public static void main(String[] args) {
	Test1 t=new Test1();
	Test t1=t;
	System.out.println("a: "+t.a);
	System.out.println("a: "+t1.a);
}
}
