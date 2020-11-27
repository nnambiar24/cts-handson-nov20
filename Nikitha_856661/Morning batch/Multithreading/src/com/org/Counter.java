package com.org;

public class Counter implements Runnable{

	@Override
	public synchronized void run() {// to get synchronized out if didn't use synchronized then random output will be shown
		// TODO Auto-generated method stub
		
		Thread t=Thread.currentThread();//getting current thread which is running
		
		for(int i=1;i<=100;i++) {
			System.out.println("counter:"+i+", name of thread "+t.getName());
			
		}
		
	}

	
	
}
