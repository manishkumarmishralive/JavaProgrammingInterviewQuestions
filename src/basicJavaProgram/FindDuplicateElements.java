package basicJavaProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// String names[] = { "Maneesh", "Alok", "Maneesh", "Pankaj", "Satish",
		// "Pankaj", "Ganesh", "Maneesh" };
		//
		// // Using each element comparison: worst case
		//
		// for (int i = 0; i < names.length; i++) {
		// for (int j = i + 1; j < names.length; j++) {
		// if (names[i].equals(names[j])) {
		// System.out.println(names[i]);
		// }
		// }
		// }
		// // Using HashSet:Java collection: It stores unique elements: o(n)
		// Set<String> store = new HashSet<String>();
		//
		// for (String name : names) {
		// if (store.add(name) == false) {
		// System.out.println("Duplicate elements:" + name);
		// }
		// }

		String names[] = { "Java", "Ruby", "Python", "Java" };

		// 1. Using comparing each element:

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println("Duplicate elements:" + names[i]);

				}
			}

		}
		// Using HashSet:
		Set<String> stores = new HashSet<String>();

		for (String name : names) {
			if (stores.add(name) == false) {

				System.out.println("Duplicate Elements:" + name);
			}
		}

	}

}
