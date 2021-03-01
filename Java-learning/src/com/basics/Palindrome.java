package com.basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("enter the number:-");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int originalvalue = n;
		int reverse = 0;
		while (n != 0) {

			int reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n = n / 10;

		}

		if (originalvalue == reverse)
			System.out.println("Yes");
		else
			System.out.println("no");
	}

}
