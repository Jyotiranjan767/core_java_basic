package com.java2novice.thread;

public class Thread_join_1 implements Runnable {
	static{
		System.out.println("luckie locc");
	}
		private int count;
		private String str1 = "Java";
		public Thread_join_1(int count){
			this.count = count;
		}
		public void run(){
				for (int i = 0; i <count; i++) {
					System.out.println(str1+":"+ i );
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		}
		public static void main(String rjtji[]) throws InterruptedException{
			Thread_join_1 tj  = new Thread_join_1(4);
			Thread t1 = new Thread(tj);
			Thread t2 = new Thread(tj);
			synchronized (t2) {
				t1.start();
//				t2.join();
			}
			synchronized (t1) {
				t2.start();
//				t1.join();
			}
		}
}
