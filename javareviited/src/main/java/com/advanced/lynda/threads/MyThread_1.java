package com.advanced.lynda.threads;

public class MyThread_1 extends Thread{
	
	@Override
	public void run() {
		
			int iterations = 8;
			try {
				for (int i = 0; i < iterations; i++) {
					System.out.println("running from run thread "+i);
					sleep(1000);
				}
			} catch (InterruptedException e) {
//				System.err.println(e);
				System.out.println(e.getMessage() +",and then returned to main thread ");
			}
	}

	
}
