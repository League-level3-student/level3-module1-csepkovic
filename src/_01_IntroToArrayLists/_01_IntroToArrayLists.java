package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("kachow");
		strings.add("ew");
		strings.add("thwip");
		strings.add("blaow");
		strings.add("krakatowa");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			System.out.println(strings.get(i));
		}
		System.out.println(' ');
		//4. Print all the Strings using a for-each loop
		for (String s: strings) {
			System.out.println(s);
		}
		System.out.println(' ');
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			if (i%2 == 0) {
				System.out.println(strings.get(i));
			}
		}
		System.out.println(' ');
		//6. Print all the Strings in reverse order.
		for (int i = 0; i < 5; i++) {
			System.out.println(strings.get(strings.size()-(i+1)));
		}
		System.out.println(' ');
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < 5; i++) {
			String s = strings.get(i);
			boolean print = false;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'e') {
					print = true;
				}
			}
			if (print) {
				System.out.println(s);
			}
		}
	}
}
