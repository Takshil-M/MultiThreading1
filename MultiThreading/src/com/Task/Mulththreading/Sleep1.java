package com.Task.Mulththreading;

public class Sleep1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
	
	
	
	public static void main(String[] args) {
			Sleep1 t= new Sleep1();
			t.start();

	}

}
