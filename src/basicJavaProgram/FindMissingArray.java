package basicJavaProgram;

public class FindMissingArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int a1[]={1,2,4,5,6,7,8,9};
		int length = a.length;
		System.out.println("Length of the given array is:" + length);

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of the given array is:" + sum);

		int sum1 = 0;

		for (int j = 0; j < 9; j++) {
			sum1 = sum1 + j;
		}
		System.out.println("sum of the missing array is:" + sum1);
		System.out.println("Missing array is:" + (sum - sum1));
	}

}
