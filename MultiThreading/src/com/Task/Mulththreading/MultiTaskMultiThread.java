package com.Task.Mulththreading;

public class MultiTaskMultiThread extends Thread{
	@Override
	public void run() {
		System.out.println("Task 1");
	}
public static class MultiTaskMultiThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("task 2");
	}
}
	
	
	
	public static void main(String[] args) {
		
		MultiTaskMultiThread t = new MultiTaskMultiThread();
		t.start();
		
		MultiTaskMultiThread1 th = new MultiTaskMultiThread1();
		th.start();

	}

}
