package basicJavaProgram;

public class SwapTwoNumber {

	public static void main(String[] args) {
		System.out.println("Before swapping x & y are:");

		// InputStream ip=new InputStream(System.in);
		int x = 5;
		int y = 10;

		// 1. using third variable
		// int t;
		// t = x;// 5
		// x = y;// 10
		// y = t;// 5

		// 2.Without using third variable: using + operator

		// x = x + y;// 15
		// y = x - y;// 5
		// x = x - y;// 10

		// 3. Without using third variable: using * operator

		// x = x * y;// 50
		// y = x / y;// 5
		// x = x / y;// 10

		// 4. using XOR:^
		// 64 32 16 8 4 2 1 0

		x = x ^ y;// 15:1111
		y = x ^ y;// 5:1010
		x = x ^ y;// 10:0101

		System.out.println("After swapping x & y are:");
		System.out.println("x is:" + x);
		System.out.println("y is " + y);

	}

}
