package com.Task.Mulththreading;

public class Wait_Notify extends Thread{
	
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1; i<=10; i++) {
				total=total+100;
			}
			this.notify();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Wait_Notify te=new Wait_Notify();
		te.start();
		
		synchronized (te) {
			te.wait();
			System.out.println("total Earning :"+te.total +" RS");
			
		}
	}

}
