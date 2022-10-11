package com.cognixia.jump.threads;

public class SyncThreadRunner {

	public static void main(String[] args) {
		
		int size=3;
		Thread[] threads= new Thread[size];
		Runnable r=()->{
			Numbers.print(100);
			};

		for(int i=0;i<threads.length;i++) {
			threads[i]=new SyncThread();
			threads[i].start();
			Thread t=new Thread(r);
			t.start();
		}
		

	}

}
