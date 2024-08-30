package heap_and_stack_diagram_june2;

class Institute {
	private final void go() {
		System.out.println("Institute");
	}
}

public class Nit extends Institute {
	public final void go() {
		System.out.println("Nit");
	}

	public static void main(String[] args) {
		new Nit().go();
	}
}
