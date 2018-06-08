package com.advanced.lynda.threads;

public class Main_intterupt {

	public static void main(String di[]){
		
		MyThread_1 mt_1 = new MyThread_1();
		mt_1.start();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		mt_1.interrupt();
		System.out.println("called interrupt()");
	}
}
