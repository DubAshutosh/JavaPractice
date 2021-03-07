package com.basics;

import java.util.Scanner;

public class RemoveGivenCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
//		StringBuilder sb = new StringBuilder(str);
		System.out.println("Enter the index no  to remove the character");
		int c=sc.nextInt();
		System.out.println(str.substring(0, c)+str.substring(c+1));
	}

}
