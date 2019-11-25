package basicJavaProgram;

public class PalinDromeNumber {

	public static void isPalinDromeNumber(int num) {
		// 121, 151, 12321
		System.out.println("Given number is:" + num);
		int r = 0;
		int sum = 0;
		int t;

		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("Given num is Palindrome");
		} else {
			System.out.println("Given number is not Palindrome");
		}
	}

	public static void main(String[] args) {
		isPalinDromeNumber(121);
		isPalinDromeNumber(123);
	}
}
