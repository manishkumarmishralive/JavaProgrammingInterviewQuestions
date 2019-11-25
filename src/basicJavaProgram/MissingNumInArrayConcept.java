package basicJavaProgram;

public class MissingNumInArrayConcept {

	public static void main(String[] args) {
		// int a[]={1,2,3,4,-------,100};
		// int a1[] = { 1, 2, 3, 4, 5 };
		// 1+2+3+4+5=15
		// 1+2+4+5=12
		// 15-12=3 is missing in array

		int a[] = { 1, 2, 3, 4, 5 };
		int length = a.length;// Length of array:
		// value at particular position of array
		System.out.println(length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		int sum = 0;
		// Here i =0 because i is always start with zero index:
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		System.out.println("Missing number is::" + (sum1 - sum));
	}

}
