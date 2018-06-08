package com.java2novice.thread;

import java.util.ArrayList;
import java.util.List;

public class Yield_thread {
	
		public static void main(String irt[]){
			List<ExmpThread> lst  = new ArrayList<>();
			for (int i = 0; i < 3; i++) {
				ExmpThread et = new ExmpThread(i+5);
				lst.add(et);
				}
			for(ExmpThread et : lst){
				try{
					et.join();
				}catch(InterruptedException sri){
					
				}
			}
		}
}
class ExmpThread extends Thread {
		
		private int stopCount ;
		public ExmpThread(int count){
			this.stopCount = count;
		}
		public void run(){
			for (int i = 0; i < 50 ; i++) {
				if(i%stopCount ==0){
					System.out.println("stopping thread  "+ getName());
					yield();
				}
			}
		}
}
