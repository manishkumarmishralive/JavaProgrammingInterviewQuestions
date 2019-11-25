package basicJavaProgram;

public class ReferenceAndContentCompConcept {

	public static void main(String[] args) {
		String s1 = "durga";
		String s2 = "durga";

		String s3 = new String("durga");
		String s4 = new String("durga");
		// == operator: is used for reference comparison
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("*********");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
