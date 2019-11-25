package basicJavaProgram;

public class ArmStrongNumber {

	public static void isArmstrongNum(int num) {
		// 153
		// 1*1*1=1
		// 5*5*5=125
		// 3*3*3=27
		// Total-->153

		// 407, 370, 371

		int cube = 0;
		int r = 0;
		// int sum = 0;

		int t;
		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		if (t == cube) {
			System.out.println("This is armstrong number");
		} else {
			System.out.println("This is not armstrong number");
		}
	}

	public static void main(String[] args) {
		isArmstrongNum(153);
		isArmstrongNum(407);
		isArmstrongNum(121);
	}

}
