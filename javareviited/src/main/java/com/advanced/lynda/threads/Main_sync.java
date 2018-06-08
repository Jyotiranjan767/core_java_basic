package com.advanced.lynda.threads;

public class Main_sync {

	public static void main(String ri[]){
	TargetClass  target  = new TargetClass();
	
	MySyncThread mst_1 = new MySyncThread(1, target);
	MySyncThread mst_2 = new MySyncThread(2, target);
	MySyncThread mst_3 = new MySyncThread(3, target);
	
	mst_1.start();
	mst_2.start();
	mst_3.start();
	}
}
