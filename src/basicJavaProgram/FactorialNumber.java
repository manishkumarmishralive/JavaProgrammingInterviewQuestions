package basicJavaProgram;

public class FactorialNumber {
	// fact of 3 is: 3*2*1=
	// fact of 6 is:6*5*4*3*2*1=
	// fact 1=1
	// fact 0=1
	public static int factoriaNum(int num) {
		int fact = 1;
		if (num == 0)
			return 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

	// With recursive function: a function is calling itself
	public static int fact(int num) {
		if (num == 0)
			return 1;

		else

			return (num * (fact(num - 1)));
	}

	public static void main(String[] args) {

		System.out.println("Factorial of given number is:" + factoriaNum(4));
		System.out.println("Factorial of given number is:" + factoriaNum(0));
		System.out.println("Factorial of given number is:" + factoriaNum(1));
		System.out.println("Factorial of given number is:" + factoriaNum(98));
		System.out.println("Factorial of given number is:" + fact(10));
	}
}
