package com.Task.Mulththreading;

public class interruptMethod extends Thread {

 @Override
public void run() {
	
	 try {
		 for(int i=0; i<=5; i++) {
			 System.out.println(i);
			 Thread.sleep(1000);
		 }
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
}
	
	
	public static void main(String[] args) {
		
		interruptMethod t= new interruptMethod();
		t.start();
		t.interrupt(); //it innterrupt the task it mean badha or adthada
	}

}
