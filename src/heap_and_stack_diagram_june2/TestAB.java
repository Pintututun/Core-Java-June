package heap_and_stack_diagram_june2;

class A {
	char ch = 'a';
	public A doStuff(char c) {
		return new A();
	}
	@Override
	public String toString() {
		return ""+this.ch;
	}	
}

class B extends A {
	char ch = 'b';
	public B doStuff(char c) { 
		ch='c';
		return new B();
	}
	@Override
	public String toString() {
		return ""+ch;
	}
	
}
public class TestAB {
public static void main(String[] args) {
	A a = new B();
	System.out.println(a.doStuff('d'));
} 
}

