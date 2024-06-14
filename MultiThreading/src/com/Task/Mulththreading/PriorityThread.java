package com.Task.Mulththreading;

public class PriorityThread extends Thread{

	@Override
	public void run() {
		System.out.println("child thread");
		System.out.println("child thread piority:"+ Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main thread old proirity :"+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Main thread new proirity :"+ Thread.currentThread().getPriority());
		PriorityThread t = new PriorityThread();
		
		t.start();
	}

}
