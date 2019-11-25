package basicJavaProgram;

public class ReverseString {

	public static void main(String[] args) {
		// String s = "selenium";
		// String rev = "";
		// System.out.println(s.length());
		//
		// // reverse using for loop:
		//
		// for (int i = s.length() - 1; i >= 0; i--) {
		// rev = rev + s.charAt(i);
		//
		// }
		// System.out.println(rev);
		//
		// // Using StringBuffer:
		// StringBuffer sb = new StringBuffer(s);
		//
		// System.out.println("reverse String is:" + sb.reverse());

		// String s1 = "Milenium";
		// String rev = "";
		// int len = s1.length();
		//
		// // reverse of String using for loop:
		// for (int i = len - 1; i >= 0; i--) {
		// rev = rev + s1.charAt(i);
		// }
		// System.out.println("reverse of the string is:" + rev);
		//
		// // using StringBuffer:
		// StringBuffer sb1 = new StringBuffer(s1);
		// System.out.println("reverse of th eString is:" + sb1.reverse());

		// 3. Using for loop:
		String s2 = "java";
		int len = s2.length();

		String rev = "";

		for (int k = len - 1; k >= 0; k--) {
			rev = rev + s2.charAt(k);
		}
		System.out.println("rev:" + rev);

	}

}
