package com.Task.Mulththreading;

public class sleepThread extends Thread {
	@Override
	public void run() {
		
		for(int i=0; i<=5; i++){
			System.out.println(i);
		}
	}


	
	
	public static void main(String[] args) throws Exception{
		
		sleepThread t =new sleepThread();
		Thread.sleep(1000);
		t.start();
	}

}
