package com.org;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter counter= new Counter();
		
		Thread t1=new Thread(counter);
		Thread t2=new Thread(counter);
		
		t1.start();
		t2.start();
		
		System.out.println("END OF PROGRAM!!!");

	}

}
