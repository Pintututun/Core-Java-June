package heap_and_stack_memory_program_june1;

class Customer
{
private String name;
private int id;

public Customer(String name , int id)
{
	this.name=name;
	this.id=id;
}
public void setId(int id)  //setter  
{
	this.id=id;
}
public int getId() //getter
{
	return id;
}
}
class Test 
{
public static void main(String[] args) 
{
	int val=100;
	Customer c = new Customer("Ravi",2);
	m1(c);
	//GC
	System.out.println(c.getId());
}
public static void m1(Customer c)
{
	c.setId(5);
	c = new Customer("Rahul",7);
	c.setId(9);
	System.out.println(c.getId());
}
}
