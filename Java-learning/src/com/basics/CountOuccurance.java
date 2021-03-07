package com.basics;

import java.util.Scanner;

public class CountOuccurance {

	public static void main(String[] args) {
	  System.out.println("enter the string: ");
	  Scanner sc=new Scanner(System.in);
	  String str= sc.next();
	  System.out.println("enter the character to count the ocurance from the String");
	  char c= sc.next().charAt(0);
	  int count=0;
	  for(int i=0;i<str.length();i++) {
		  if(str.charAt(i)==c) {
			  count++;
		  }
	  }
	  System.out.println("count of "+c+ " is->"+count);
	  
	  
	}

}
