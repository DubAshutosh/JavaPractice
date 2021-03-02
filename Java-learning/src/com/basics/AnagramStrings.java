package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
	boolean checkStringAnagrams(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();
		if (l1 != l2) {
			return false;
		}
		char str3[] = str1.toCharArray();
		char str4[] = str2.toCharArray();
		Arrays.parallelSort(str3);
		Arrays.parallelSort(str4);
		for (int i = 0; i < l1; i++)
			if (str3[i] != str4[i])
				return false;

		return true;

	}

	public static void main(String[] args) {
		AnagramStrings obj1 = new AnagramStrings();
		System.out.println("Enter first String: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("Enter Second string: ");
		String str2 = sc.next();

		if (obj1.checkStringAnagrams(str1, str2)) {
			System.out.println("String is Anagram of each other");
		} else {
			System.out.println("not a anagram");
		}

	}

}
