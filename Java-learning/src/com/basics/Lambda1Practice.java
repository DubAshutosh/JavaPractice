package com.basics;

public class Lambda1Practice {

	public static void main(String[] args) {
     Addition ad=  (a,b)->{ return (a+b);
       };
       
       Addition ad1=(a,b)->(a+b);
       
       System.out.println(ad1.add(100, 200));
       System.out.println(ad.add(5, 6));
	}

}
@FunctionalInterface
interface Addition{
	int add(int a, int b);
}
