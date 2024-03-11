package com.java_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	static String rString = "India";

	static String rString1 = "Pakistan";

	static String rString2 = "United States Of America";

	static String rString3 = "Tamil Nadu";

	// Using String Buffer
	public static void usingStringBuffer() {

		StringBuffer sB = new StringBuffer();

		sB.append(rString);

		System.out.println(sB.reverse());

	}

	// Using String Builder
	public static void usingStringBuilder() {

		StringBuilder sb = new StringBuilder(rString1);

		sb.reverse();

		String reverseStr = sb.toString();

		System.out.println(reverseStr);

	}

	// Using Own logic CharArray[] as reverse iteration
	public static void usingCharArray() {

		char[] charArray = rString2.toCharArray();

		String reverse = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse = reverse + charArray[i];

		}
		// After loop
		System.out.println(reverse);

	}

	// Using Collections of ArrayList
	public static void usingArrayList() {

		char[] charArray = rString3.toCharArray();

		// Convert the original string to a list of characters
		List<Character> list = new ArrayList<>();

		for (char character : charArray) {
			list.add(character);

		}
		// Reverse the list of characters
		Collections.reverse(list);

		// Print the reversed characters using a for-each loop
		for (char character : list) {
			System.out.print(character);
		}
	}

	public static void main(String[] args) {
		usingStringBuffer();
		usingStringBuilder();
		usingCharArray();
		usingArrayList();

	}

}
