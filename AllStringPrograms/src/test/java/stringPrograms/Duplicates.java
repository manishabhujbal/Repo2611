package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {

		Map<Character, Integer> m = new HashMap<>();
		int counter = 0;
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		str = s.next();
		char c[] = str.toCharArray();
		for (char key : c) {
			if (m.containsKey(key)) {
				m.put(key, m.get(key) + 1);
			} else {
				m.put(key, 1);
			}
		}
		System.out.println(m);
		

	}
}