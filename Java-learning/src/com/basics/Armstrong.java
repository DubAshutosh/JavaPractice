package com.basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	System.out.println("enter the number; ");
	Scanner sc = new Scanner(System.in);
		
		int number=sc.nextInt();
		int orgNumber= number;
		int cubicSum=0;
		
		while(number!=0) {
			int reminder= number%10;				
			cubicSum=(int) (Math.pow(reminder, 3)+cubicSum);
			number=number/10;
		}
		System.out.println(cubicSum);
		if(cubicSum==orgNumber)
			System.out.println("Yes");
		else
			System.out.println("no");
	}

}
