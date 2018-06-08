package com.advanced.lynda.threads;

public class MySyncThread extends Thread {

	private int threadId;
	private TargetClass target;
	
	public MySyncThread(int threadId, TargetClass target){
		this.threadId = threadId;
		this.target = target;
	}
	@Override
	public void run() {
		
//		int iterations =4 ;
		
		synchronized(target){
		try{
			sleep(2000);
			
		}catch(InterruptedException s ){
			System.err.println(s.getMessage());
		} 
		target.call(threadId);
	}
	}
	
}
