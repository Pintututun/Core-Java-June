package heap_and_stack_diagram_june2;

public class Beta  
{
	public static void main(String[] args) 
	{
		Alpha am1 = new Alpha(9);
		Alpha am2 = new Alpha(2);
		Alpha []ar = fill(am1, am2);
		ar[0] = am1;
		System.out.println(ar[0].val);
		System.out.println(ar[1].val);
	}
	public static Alpha[] fill(Alpha a1, Alpha a2)
	{
		a1.val = 2;
		Alpha fa[] = new Alpha[]{a2, a1};
		return fa;
	}
}
class Alpha
{
	int val;
	static int sval = 200;
	static Beta b = new Beta();
	Alpha(int val)
	{
      this.val = val;
	}
}
