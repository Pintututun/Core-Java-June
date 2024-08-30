package heap_and_stack_diagram_june2;

class Animal1 {
	static void doStuff() {
		System.out.print("a ");
	}
}

public class Dog_pet extends Animal1 {
	static void doStuff() { 
		System.out.print("d ");
	}

	public static void main(String[] args) {
		Animal1 a1 = new Animal1();
             Animal1 a2 = new Dog_pet();
             Animal1 a3 = new Animal1();
		a1.doStuff(); a2.doStuff(); a3.doStuff();
	}
}
