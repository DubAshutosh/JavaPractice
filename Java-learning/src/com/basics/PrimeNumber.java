package com.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
			System.out.println("enter the number:-");
			Scanner sc = new Scanner(System.in);
			int number= sc.nextInt();
			int flag =0;
			if(number==1 || number==0) {
				System.out.println("1 AND 0 is not a prime number");
			}
			for(int i=2;i<=(number-1);i++) {
				if(number%i==0) {
					flag++;
				}
			}
			if(flag>0) {
				System.out.println("Not a Prime Number:");
			}
			else {
				System.out.println("Prime Number");
			}
			
	}

}
