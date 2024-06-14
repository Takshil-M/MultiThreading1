package com.Task.Mulththreading;

public class DomainThread extends Thread{

	public void run() {
		System.out.println("Domain Thread");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main thread");
		DomainThread t= new DomainThread();
		t.setDaemon(true);
		t.start();
	}

}
