package basicJavaProgram;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s1 = "manesh2334@#%#$$%%$Mishra";

		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		String s2 = "123maneesh!@#Mishra";
		s2 = s2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
	}

}
