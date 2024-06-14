package com.Task.Mulththreading;

public class joinMethod extends Thread {
	@Override
	public void run() {
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("child Thread :"+i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	
	public static void main(String[] args) throws InterruptedException{
			
		joinMethod t=new joinMethod();
		t.start();
		
		t.join();
		
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("Main Thread :"+i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
