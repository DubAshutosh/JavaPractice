package com.basics;

import java.util.Scanner;

public class Factorial {
	static int fact(int number) {
//		int fact=1;
//		for(int i=1;i<=number;i++) {
//			fact= i*fact;
//			
//		}
//		System.out.println(fact);
		
		if(number==0) {
			return 1;
		}else
		{
			return number*fact(number-1);
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int fact = Factorial.fact(n);
        System.out.println(fact);
	}
	

}
