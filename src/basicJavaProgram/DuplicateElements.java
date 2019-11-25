package basicJavaProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String names[] = { "Java", "Ruby", "Python", "c", "Java", };
		System.out.println(names.length);
		// 1. compare each elements: o(nxn): worst solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate elements is :" + names[i]);
				}
			}
		}
		System.out.println("**********");
		// 2. Using HashSet: Java collection: It stores unique values: o(n)
		Set<String> store = new HashSet<String>();

		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate element is :" + name);
			}

		}
		// 3. Using HashMap

	}

}
