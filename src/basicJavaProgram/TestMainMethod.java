package basicJavaProgram;

public class TestMainMethod {

	public static void main(String[] args) {
		System.out.println("Main method-1");
		main("maneesh");
		main(10);
		main(10, 20);

	}

	public static void main(String args) {
		System.out.println("main method-2");
	}

	public static void main(int a) {
		System.out.println("Main method-3");
	}

	public static void main(int a, int b) {
		System.out.println("main method-4");
	}
}
