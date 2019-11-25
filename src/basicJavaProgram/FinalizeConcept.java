package basicJavaProgram;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("final method");
	}

	public static void main(String[] args) {
		FinalizeConcept obj1 = new FinalizeConcept();
		FinalizeConcept obj2 = new FinalizeConcept();
		obj1 = null;
		obj2 = null;

		System.gc();

	}

}
