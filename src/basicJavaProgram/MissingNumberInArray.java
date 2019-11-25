package basicJavaProgram;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		// int num1[] = { 1, 2, 4, 5 };
		// 1+2+3+4+5=15
		// 1+2+4+5=12

		int length = num.length;
		System.out.println("length" + length);

		System.out.println("Array value at particular position");
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		// System.out.println(num[5]);
		int sum = 0;

		for (int i = 0; i < length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum of the array is:" + sum);
		int sum1 = 0;
		for (int k = 0; k < 5; k++) {
			sum1 = sum1 + k;
		}
		System.out.println("Sum of the missing array is:" + sum1);
		System.out.println("Missing array is :" + (sum - sum1));
	}

}
