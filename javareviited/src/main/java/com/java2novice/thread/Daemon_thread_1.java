package com.java2novice.thread;

public class Daemon_thread_1 extends Thread{
	
	public Daemon_thread_1(){
				
			setDaemon(true);
	}
	public void run(){
		System.out.println("Is this thread daemon "+ isDaemon());
	}
	
	public static void main(String rut[]){
		Daemon_thread_1 dt_1 = new Daemon_thread_1();
		//even you can set daemon constrain here also
		//it is like dt_1.setDaemon(true);
		dt_1.start();
	}
	
}
