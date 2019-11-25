package basicJavaProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayConcept {

	public static void main(String[] args) {

		String names[] = { "Java", "Javascript", "Ruby", "Python", "C", "Java", "C" };
		int length = names.length;
		System.out.println(length);
		System.out.println("****Name of the array as per the position******");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);

		// 1. compare each element:0(nxn): worst solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is::" + names[i]);
				}
			}
		}

		// 2.Using HashSet:Java collection: It stores unique values

		Set<String> store = new HashSet<String>();
	}
}
