package com.study.thread;

class RunnableDemo implements Runnable{
	
	private String name;
	public RunnableDemo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 0;i < 5;i++){
			System.out.println("当前线程对象"+Thread.currentThread().getName());
		}
	}
	
}

public class ThreadDemo03 {

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("A");
		RunnableDemo r2 = new RunnableDemo("A");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		
		t2.start();

	}

}
