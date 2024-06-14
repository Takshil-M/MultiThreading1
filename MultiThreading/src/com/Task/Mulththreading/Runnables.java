package com.Task.Mulththreading;

public class Runnables implements Runnable {

	@Override
	public void run() {
		System.out.println("threads start");
		
	}

	
	
	public static void main(String[] args) {
		
		Runnables r = new Runnables();
		Thread t= new Thread(r);
		t.start();

	}

	

}
