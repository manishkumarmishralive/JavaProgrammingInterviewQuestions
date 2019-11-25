package basicJavaProgram;

public class RemoveJunkConcept {

	public static void main(String[] args) {
		String s = "@##$$##Selenium*&**&&*$#@Test";

		String s1 = "@@!@@Selenium1213311313&^^%%^^Testing____213737264726472727QA##@$#$%#%#%#";
		// We can remove special character using regular expression
		// Regular expression: [^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s1);
	}
}
