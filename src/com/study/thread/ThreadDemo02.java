package com.study.thread;

public class ThreadDemo02 {
	public static void main(String args[]){
		MyRunnable m1 = new MyRunnable("C");
		MyRunnable n1 = new MyRunnable("D");
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(n1);
		
		t1.start();
		t2.start();
	}

}
