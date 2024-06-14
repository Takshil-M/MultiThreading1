package com.Task.Mulththreading;

public class SingleTaskMultipleThread extends Thread {

	public void run() {
		System.out.println("thread start");
	}
	
	
	
	public static void main(String[] args) {
		
		SingleTaskMultipleThread s = new SingleTaskMultipleThread();
		s.start();
		SingleTaskMultipleThread s1 = new SingleTaskMultipleThread();
		s1.start();
		

	}

}
