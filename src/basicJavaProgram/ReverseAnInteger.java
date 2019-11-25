package basicJavaProgram;

public class ReverseAnInteger {

	public static void main(String[] args) {

		// // 1. Using loop:
		// int num = 1234;
		// int rev = 0;
		// while (num != 0) {
		// rev = (rev * 10) + num % 10;
		// num = num / 10;
		// }
		// System.out.println("Reverse integer is:" + rev);
		//
		// // 2. Using StingBuffer:
		// long num1 = 12345;
		// StringBuffer sb = new StringBuffer(String.valueOf(num1));
		// System.out.println("Reverse integer is:" + sb.reverse());

		// long num1 = 123234;
		// long rev = 0;
		//
		// while (num1 != 0) {
		// rev = (rev * 10) + num1 % 10;
		// num1 = num1 / 10;
		// }
		// System.out.println(rev);
		// long num2 = 123456;
		//
		// StringBuffer sb1 = new StringBuffer(String.valueOf(num2));
		// System.out.println(sb1.reverse());

		long num3 = 123456789;
		long rev3 = 0;
		while (num3 != 0) {
			rev3 = (rev3 * 10) + num3 % 10;
			num3 = num3 / 10;

		}
		System.out.println(rev3);
		long num4 = 1234567890;
		// using StringBuffer
		StringBuffer sb3 = new StringBuffer(String.valueOf(num4));
		System.out.println(sb3.reverse());

	}

}
