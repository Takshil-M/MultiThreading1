package com.Task.Mulththreading;

public class InterruptedMethod extends Thread {
	

	public void run() {
		
		System.out.println(Thread.interrupted());
		//System.out.println(Thread.currentThread().isInterrupted());
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
				//System.out.println(Thread.interrupted());
			}
		}
		catch(Exception e) {
			System.out.println("thrread interrupted: "+e);
		}
	}

	public static void main(String[] args) {
				
		InterruptedMethod t= new InterruptedMethod();
		t.start();
		t.interrupt();
	}

}
