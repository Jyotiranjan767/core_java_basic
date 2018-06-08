package com.advanced.lynda.threads;

public class Main_thread {
	
		public static void main(String ri[]) throws InterruptedException{
			MyThread_1 mt_1 = new MyThread_1();
			mt_1.start();
			
			MyRunnable mr = new MyRunnable();
			new Thread(mr).start();
			
			int iterations = 8 ;
			for (int i = 0; i < iterations; i++) {
				System.out.println("running from main thread "+ i );
				Thread.sleep(1000);
			}
		}
}
