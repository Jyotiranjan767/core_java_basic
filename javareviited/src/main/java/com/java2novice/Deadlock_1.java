package com.java2novice;

public class Deadlock_1 {

	String str1 = "JAVA";
	String str2  = "UNIX";
	
	Thread t1 = new Thread(){
		public void run(){
			synchronized(str1){
				synchronized (str2) {
					for (int i = 0; i < 13; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(str1 + str2);
				}
			}}
		}
	};
	
	Thread t2 = new Thread(){
		public void run(){
			String s = "abcdefghijklm";
			char[]  c = s.toCharArray();
			for (int i = 0; i <s.length(); i++) {
				synchronized (str2) {
					synchronized (str1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(str1 + str2);
			}
		}}}
	};
	
	public static void main(String ritu[]){
		
		Deadlock_1 d1 = new Deadlock_1();
		d1.t2.start();
		d1.t1.start();
	}
}
