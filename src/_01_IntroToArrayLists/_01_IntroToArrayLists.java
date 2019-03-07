package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> stringarray = new ArrayList<String>();
		// 2. Add five Strings to your list
		stringarray.add("Sam");
		stringarray.add("Bill");
		stringarray.add("John");
		stringarray.add("Fiona");
		stringarray.add("Sean");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stringarray.size(); i++) {
			String s = stringarray.get(i);
			// System.out.println("String at element " + i + " " + s);
		}

		// 4. Print all the Strings using a for-each loop
		for (String x : stringarray) {
			// System.out.println(x);
		}
		// 5. Print only the even numbered elements in the list.
		for (int h = 0; h < stringarray.size(); h += 2) {
			String s = stringarray.get(h);
			// System.out.println(s);
		}
		// 6. Print all the Strings in reverse order.
		for (int e = stringarray.size() - 1; e >= 0; e--) {
			String s = stringarray.get(e);
			// System.out.println(s);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int onlye = 0; onlye < stringarray.size(); onlye++) {
			String s = stringarray.get(onlye);
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
