package heap_and_stack_diagram_june2;

class Tree
{
	char b='a';
	public Tree change(char c)
	{
		b='c';
		return new Tree();
	}
	@Override
	public String toString() {
		return b+"";
	}
	
}
public class Main {
public static void main(String[] args) {
	Tree t=new Tree();
	System.out.println(t.change('d'));
}
}
