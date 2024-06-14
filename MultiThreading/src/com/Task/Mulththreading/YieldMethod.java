package com.Task.Mulththreading;

public class YieldMethod extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

	public static void main(String[] args) {
		
		YieldMethod t = new YieldMethod();
		t.start();
		
		Thread.yield();
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}

	}

}
