package com.basics;

public class StaticBlock {
	  static int i;
      int j;
      static {
    	  i=10;
    	  System.out.println("Static block! ");
      }
      public StaticBlock() {
    	  System.out.println("constructor called!");
      }
	public static void main(String[] args) {
		StaticBlock ref1= new StaticBlock();
		System.out.println(StaticBlock.i);
     
       
	}

}
