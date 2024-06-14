package com.Task.Mulththreading;

public class Threads extends Thread{
	
	public void run() {
		System.out.println("thread task");
	}

	
	public static void main(String[] args) {
		
		Threads t = new Threads();
		t.start();

	}

}
