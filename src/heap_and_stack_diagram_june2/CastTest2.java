package heap_and_stack_diagram_june2;

class Animal {
	void makeNoise() {
		System.out.print(" making noise ");
	}
	void playDead() {
		System.out.print(" rolling ");
	}
	
}

class Dog extends Animal {
	void makeNoise() {
		System.out.print(" bark ");
	}

	void playDead() {
		System.out.print(" rolling ");
	}
}

class CastTest2 {
	public static void main(String[] args) {
		Dog a =  new Dog();
		a.makeNoise();
		if (a instanceof Dog) {
		  a.playDead();
		}
	}
}

