package com.advanced.lynda.threads;

public class MyRunnable  implements Runnable {
	
	@Override
	public void run() {
		int iterations   =  8;
		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("from runnble interface "+ i);
				Thread.sleep(2312);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
