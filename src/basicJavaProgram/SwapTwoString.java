package basicJavaProgram;

public class SwapTwoString {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "world";
		System.out.println("Before swapping");
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);

		// append a & b:
		a = a + b;// Helloworld

		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("After swapping");
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
	}

}
