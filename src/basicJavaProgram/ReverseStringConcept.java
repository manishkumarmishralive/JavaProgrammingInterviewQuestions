package basicJavaProgram;

public class ReverseStringConcept {

	public static void main(String[] args) {
		String s = "Selenium";
		String rev = "";

		int len = s.length();
		System.out.println(len);// 8
		// 1st- Reverse String Using for loop:
		System.out.println("*****Reverse String Using for loop*****");
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// 2nd-Using StringBuffer:
		System.out.println("***Reverse String Using StringBuffer****");
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
