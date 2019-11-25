package basicJavaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("7 is prime number:" + isPrimeNumber(7));
		System.out.println("5 is prime number:" + isPrimeNumber(5));
		System.out.println("-1 is prime number:" + isPrimeNumber(-1));
		System.out.println("10 is prime number:" + isPrimeNumber(10));
		System.out.println("18 is prime number:" + isPrimeNumber(18));
		System.out.println("19 is prime number:" + isPrimeNumber(19));
		System.out.println("Prime number upto 20");
		getPrimeNumber(20);
		System.out.println("Prime number upto 19");
		getPrimeNumber(19);
	}

	// 1 2 3 4 5 6 7 8 9
	public static boolean isPrimeNumber(int num) {
		// Edge/corner cases:
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}
		}
	}
}
