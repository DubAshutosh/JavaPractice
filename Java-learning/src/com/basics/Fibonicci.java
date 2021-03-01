package com.basics;

import java.util.Scanner;

public class Fibonicci {

	public static void main(String[] args) {
		System.out.println("enter the no. of element in series");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1 = 0;
		int t2 = 1;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

}
