package com.basics;

public class LambdaThread {

	public static void main(String[] args) {
		Runnable r3= new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 3 is running..");
			}
		};
		Thread t3= new Thread(r3);
		t3.start();
	      
        //Thread Example without lambda  
        Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  
        //Thread Example with lambda  
        Runnable r2=()->{  
                System.out.println("Thread2 is running...");  
        };  
        Thread t2=new Thread(r2);  
        t2.start();  
    }  

	}


